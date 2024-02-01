import { Component } from '@angular/core';
import { Account } from '../Account';
import { AccountsApiService } from '../accounts-api.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-account-details',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './account-details.component.html',
  styleUrl: './account-details.component.css'
})
export class AccountDetailsComponent {

  accountDeatils?:Account;

  constructor(private apiService:AccountsApiService){}

  public findAccountDeatils(accountNo:any){
    this.apiService.fetchAccountDetails(accountNo)
        .subscribe(
          response =>{
            this.accountDeatils=response
          }
        )
  }



}
