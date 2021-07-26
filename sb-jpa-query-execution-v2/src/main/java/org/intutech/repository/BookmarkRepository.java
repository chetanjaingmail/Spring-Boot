package org.intutech.repository;

import java.util.List;

import org.intutech.bean.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark, Integer> {
	public List<Bookmark> findByTitle(String title);
}
