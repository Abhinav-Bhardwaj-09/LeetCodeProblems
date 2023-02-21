SELECT DISTINCT user.name, IFNULL(SUM(distance) OVER (PARTITION BY user_id), 0) as travelled_distance FROM Rides ride RIGHT JOIN Users user ON ride.user_id = user.id ORDER BY travelled_distance DESC, name;