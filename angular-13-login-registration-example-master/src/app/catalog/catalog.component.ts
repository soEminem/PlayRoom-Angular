import { ApiGamesService } from './../_services/api-games.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-catalog',
  templateUrl: './catalog.component.html',
  styleUrls: ['./catalog.component.css']
})
export class CatalogComponent implements OnInit {

  constructor(private ApiGames:ApiGamesService) { }

  gamesDB!:any

  ngOnInit(): void {
  this.getGames()
  }

  getGames(){
    this.ApiGames.getAllGames().subscribe({
      next : (success:any ) =>{
        this.gamesDB = success
      }
    })
  }

}
