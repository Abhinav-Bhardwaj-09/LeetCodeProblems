DELETE Person1 FROM Person Person1, Person Person2 WHERE (Person1.Id > Person2.Id AND Person1.Email = Person2.Email);