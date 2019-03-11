package com.wiredbrain.friends;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wiredbrain.friends.model.Friend;
import com.wiredbrain.friends.services.FriendService;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ServiceTests {
	
	@Autowired 
	FriendService friendService;
	
	
	@Test
	public void testCreateReadDelete() {
	
		
		Friend friend = new Friend("Gordon", "Moore");
		
		friendService.save(friend);
		
		Iterable<Friend> friends = friendService.findAll();
		Assertions.assertThat(friends).extracting(Friend::getFirstName).containsOnly("Gordon");
		
		friendService.deleteAll();
		Assertions.assertThat(friendService.findAll()).isEmpty();
		

	}

}
