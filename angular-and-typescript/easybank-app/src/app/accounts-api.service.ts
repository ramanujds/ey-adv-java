import { Injectable } from '@angular/core';
import { Account } from './Account';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AccountsApiService {

  private baseUrl="http://localhost:5000/api/v1/accounts"

  constructor(private httpClient:HttpClient) { }

  public fetchAccountDetails(accountNo:number):Observable<Account>{
     return this.httpClient.get(this.baseUrl+"/"+accountNo)
  }

  public addAccount(account:Account):Observable<Account>{
    return this.httpClient.post(this.baseUrl,account)
  }

}
