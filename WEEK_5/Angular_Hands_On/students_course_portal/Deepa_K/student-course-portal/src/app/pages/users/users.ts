import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Api } from '../../services/api';

@Component({
  selector: 'app-users',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './users.html',
  styleUrl: './users.css'
})
export class Users {

  users: any[] = [];

  constructor(private api: Api) {

    this.api.getUsers().subscribe({
      next: (data) => {
        this.users = data;
      },
      error: (err) => {
        console.log(err);
      }
    });

  }

}
