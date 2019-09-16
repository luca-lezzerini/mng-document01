import { Component } from '@angular/core';
import { HttpClientService } from './http-client.service';
import { Documento1 } from './Documento1';
import { Documento3 } from './Documento3';
import { Documento2 } from './Documento2';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'proj1309';
  campo1:string;
  campo2:string;
  campo3:string;
  numero1:number;
  numero2:number;
  numero3:number;
  listaDoc1:Documento1[];
  listaDoc2:Documento2[];
  listaDoc3:Documento3[];
  doc1:boolean=false;
  doc2:boolean=false;
  doc3:boolean=false;

  insertDocOk:boolean=false;
  insertDocOk2:boolean=false;
  insertDocOk3:boolean=false;

  insertDocKo:boolean=false;
  insertDocKo2:boolean=false;
  insertDocKo3:boolean=false;

  constructor(private http:HttpClientService) { }

  insertDoc1(){
    var doc:Documento1 = {
      campo:this.campo1,
      numero:this.numero1
    };
    this.http.postHttp("http://localhost:8080/insertDoc1",doc).subscribe(s => this.getDoc1(),()=>{this.insertDocKo=true;this.insertDocOk=false},()=>{this.insertDocOk=true;this.insertDocKo=false;});
  }

  insertDoc2(){
    var doc:Documento2 = {
      campo:this.campo2,
      numero:this.numero2
    };
    this.http.postHttp("http://localhost:8080/insertDoc2",doc).subscribe(s => this.getDoc2(),()=>{this.insertDocKo2=true;this.insertDocOk2=false},()=>{this.insertDocOk2=true;this.insertDocKo2=false;});
  }

  insertDoc3(){
    var doc:Documento3 = {
      campo:this.campo3,
      numero:this.numero3
    };
    this.http.postHttp("http://localhost:8080/insertDoc3",doc).subscribe(s => this.getDoc3(),()=>{this.insertDocKo3=true;this.insertDocOk3=false},()=>{this.insertDocOk3=true;this.insertDocKo3=false;});
  }

  getDoc1(){
    this.doc1=false;
    this.doc2=false;
    this.doc3=false;
    this.insertDocOk2=false;
    this.insertDocOk3=false;
    this.insertDocKo2=false;
    this.insertDocKo3=false;
    let ox: Observable<Documento1[]> = this.http.getHttp("http://localhost:8080/getDoc1");
    ox.subscribe(s => this.listaDoc1 = s,()=>console.log("errore"),()=>this.doc1=true);
  }

  getDoc2(){
    this.doc1=false;
    this.doc2=false;
    this.doc3=false;
    this.insertDocOk=false;
    this.insertDocOk3=false;
    this.insertDocKo=false;
    this.insertDocKo3=false;
    let ox: Observable<Documento2[]> = this.http.getHttp("http://localhost:8080/getDoc2");
    ox.subscribe(s => this.listaDoc2 = s,()=>console.log("errore"),()=>this.doc2=true);
  }

  getDoc3(){
    this.doc1=false;
    this.doc2=false;
    this.doc3=false;
    this.insertDocOk2=false;
    this.insertDocOk=false;
    this.insertDocKo2=false;
    this.insertDocKo=false;
    let ox: Observable<Documento3[]> = this.http.getHttp("http://localhost:8080/getDoc3");
    ox.subscribe(s => this.listaDoc3 = s,()=>console.log("errore"),()=>this.doc3=true);
  }
}
