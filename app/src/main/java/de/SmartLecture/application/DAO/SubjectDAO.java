package de.SmartLecture.application.DAO;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;
import de.SmartLecture.application.helper.Subject;

@Dao
public interface SubjectDAO {

    @Insert
    void insert(Subject subject);

    @Update
    void update(Subject subject);

    @Delete
    void delete (Subject subject);

    @Query("DELETE FROM subject_table")
    void deleteAllSubjects();

    @Query("SELECT * FROM subject_table ORDER BY dateStart")
    LiveData<List<Subject>> getAllSubjects();
}
