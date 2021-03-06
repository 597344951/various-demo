package com.peaceful.demo.akka.setup;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.peaceful.demo.akka.actor.ActorLifeCycle;
import com.peaceful.demo.akka.actor.SayHello;

/**
 * @author WangJun
 * @version 1.0 @{DATE}
 */
public class ActorLifeCycleSetup {

    private static final ActorSystem AKKA = ActorSystem.create();

    public static void main(String[] args) {
        ActorRef helloActor = AKKA.actorOf(Props.create(ActorLifeCycle.class));
        helloActor.tell("hello world!",ActorRef.noSender());
    }
}
