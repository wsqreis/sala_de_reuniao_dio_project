package com.digital.crud.saladereunia.saladereuniao.repository;

import com.digital.crud.saladereunia.saladereuniao.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
