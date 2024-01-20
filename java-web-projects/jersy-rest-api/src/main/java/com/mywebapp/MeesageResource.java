package com.mywebapp;

import com.mywebapp.model.Message;
import com.mywebapp.service.MessageService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("messages")
public class MeesageResource {

    MessageService messageService = new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getAllMessages() {
        return messageService.getAllMessages();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Message addMessage(Message message) {
        return messageService.addMessage(message);
    }


    @GET
    @Path(("/{name}"))
    @Produces(MediaType.APPLICATION_JSON)
    public Message getMessage(@PathParam("name") String name) {
        return messageService.getMessage(name);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Message updateMessage(Message message) {
        return messageService.updateMessage(message);
    }

    @DELETE
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message removeMessage(@PathParam("name") String name) {
        return messageService.removeMessage(name);
    }













}
