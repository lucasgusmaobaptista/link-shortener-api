package me.lucasgusmao.encurtador.repository;

import me.lucasgusmao.encurtador.entity.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
    Link findByShortUrl(String shortUrl);
}
