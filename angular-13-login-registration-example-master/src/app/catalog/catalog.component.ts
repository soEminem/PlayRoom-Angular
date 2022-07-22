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
      next: (success:any ) => this.gamesDB = success,
      error: (error) => console.log("Chiamata GET fallita")
    })
  }

  /*
  
  Opzione 1: edit con form in una nuova pagina (se prevista pagina dettagli), in tal caso faccio redirect
   Opzione 2: inline edit form, qui bisogna fare la subscribe ma implementare i form
   Ditemi voi

  editGame(newGame: any ) {
    this.ApiGames.editGame(newGame.id, newGame).subscribe({
      next: (success:any ) => this.gamesDB = success,
      error: (error) => console.log("Chiamata GET fallita")
    })
  } */

  deleteGame(gameId: number) {
    this.ApiGames.deleteGame(gameId).subscribe({
      next: (success:any ) => console.log("Gioco eliminato con successo"),
      error: (error) => console.log("Chiamata GET fallita")
    })
  }

}
