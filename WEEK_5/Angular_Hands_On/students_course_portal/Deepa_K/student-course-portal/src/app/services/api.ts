import { Injectable, inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class Api {

  private http = inject(HttpClient);

  url = 'https://jsonplaceholder.typicode.com/users';

  getUsers() {
    return this.http.get<any[]>(this.url);
  }
}
