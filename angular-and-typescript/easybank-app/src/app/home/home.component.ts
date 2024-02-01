import { Component } from '@angular/core';
import { AccountDetailsComponent } from "../account-details/account-details.component";
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { AddAccountComponent } from "../add-account/add-account.component";

@Component({
    selector: 'app-home',
    standalone: true,
    templateUrl: './home.component.html',
    styleUrl: './home.component.css',
    imports: [AccountDetailsComponent, FormsModule, CommonModule, AddAccountComponent]
})
export class HomeComponent {

   btnDisabled = false;
   message?:string;

    greet(message:string){
        this.message=message;
        console.log(message);
    }

}
