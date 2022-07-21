import { ApiGamesService } from './../_services/api-games.service';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-donation',
  templateUrl: './donation.component.html',
  styleUrls: ['./donation.component.css']
})
export class DonationComponent implements OnInit {

  constructor(private ApiGame:ApiGamesService) { }

  ngOnInit(): void {
  }

  check(){
    this.ApiGame.addGams(this.gameForm.value).subscribe({
      next : (success:any) =>{
        console.log("New Game Inserito");
      }
    })
  }

  gameForm = new FormGroup({

    category: new FormControl(""),
    name: new FormControl(""),
    nPlayers: new FormControl(""),
    pegi: new FormControl(""),
    type: new FormControl("")

  })

}
