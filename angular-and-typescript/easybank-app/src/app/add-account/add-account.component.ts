import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Form } from 'react-router-dom';
import { Account } from '../Account';
import { AccountsApiService } from '../accounts-api.service';

@Component({
  selector: 'app-add-account',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './add-account.component.html',
  styleUrl: './add-account.component.css'
})
export class AddAccountComponent {

  constructor(private apiService:AccountsApiService) { }

addAccount(account:Account) {
  account.accountCreationDate=new Date();
  this.apiService.addAccount(account)
      .subscribe(
        response => {
          alert("Account added successfully");
          console.log(response);
        }
      )
}

}
