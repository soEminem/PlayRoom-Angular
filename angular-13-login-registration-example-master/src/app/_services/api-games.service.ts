import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ApiGamesService {

  url:string = 'http://localhost:8069';


   constructor(private http: HttpClient) { }

    getAllGames(){
      return this.http.get<any>(`${this.url}/getAllGames`);
    }

    addGams(s:any){
      const body = s;

      return this.http.post(`${this.url}/addNewGame`,body)
    }

  }
