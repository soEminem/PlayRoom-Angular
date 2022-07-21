import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiGamesService {

  url:string = 'http://localhost:8069';


   constructor(private http: HttpClient) { }

    public getAllGames(): Observable<any> {
      return this.http.get<any>(`${this.url}/getAllGames`);
    }

    public editGame(gameId: number, game: any): Observable<any> {
      return this.http.put<any>(`${this.url}/getAllGames/${gameId}`, game);
    }

    public deleteGame(gameId: number): Observable<any> {
      return this.http.delete<any>(`${this.url}/deleteGame/${gameId}`);
    }

    addGames(s:any){
      const body = s;

      return this.http.post(`${this.url}/addNewGame`,body)
    }

  }
