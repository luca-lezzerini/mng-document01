import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(private http:HttpClient) { }

  public getHttp<T>(url:string): Observable<T> {
    return this.http.get<T>(url);
   }

   public postHttp(url:string,json:any): Observable<any> {
    return this.http.post(url,json);
   }
   
}
