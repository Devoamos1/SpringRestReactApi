import { Component, OnInit } from '@angular/core';
import { FriendService } from '../shared/friend/friend.service';

@Component({
  selector: 'app-friend-list',
  templateUrl: './friend-list.component.html',
  styleUrls: ['./friend-list.component.css']
})
export class FriendListComponent implements OnInit {
  friends: Array<any>;

  constructor(private friendService: FriendService) { }

  ngOnInit() {
      this.friendService.getAll().subscribe(data => {
      this.friends = data;
    });
  }

}
