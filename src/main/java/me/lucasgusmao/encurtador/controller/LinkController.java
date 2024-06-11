package me.lucasgusmao.encurtador.controller;

import me.lucasgusmao.encurtador.entity.Link;
import me.lucasgusmao.encurtador.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LinkController {
    @Autowired
    private LinkService service;

    public LinkController(LinkService service) {
        this.service = service;
    }

    @PostMapping
    public Link shortenLink(@RequestBody String url) {
        return service.createShortLink(url);
    }

    @GetMapping("/api/{url}")
    public String getOriginalUrl(@PathVariable String url) {
        Link link = service.getOriginalUrl(url);
        return link != null ? link.getOriginalUrl() : "URL não encontrada";
    }
}
