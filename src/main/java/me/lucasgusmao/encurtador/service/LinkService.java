package me.lucasgusmao.encurtador.service;

import me.lucasgusmao.encurtador.entity.Link;
import me.lucasgusmao.encurtador.repository.LinkRepository;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class LinkService {
    private LinkRepository repository;

    public LinkService(LinkRepository repository) {
        this.repository = repository;
    }

    public Link createShortLink(String url) {
        String shortUrl = generateShortUrl();
        Link link = new Link();
        link.setOriginalUrl(url);
        link.setShortUrl("https://short.link/"+ shortUrl);
        return repository.save(link);
    }

    public Link getOriginalUrl(String url) {
        return repository.findByShortUrl(url);
    }

    private String generateShortUrl() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcefgprstuvwxyz0123456789";
        StringBuilder shortUrl = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            shortUrl.append(characters.charAt(random.nextInt(characters.length())));
        }
        return shortUrl.toString();
    }

}
