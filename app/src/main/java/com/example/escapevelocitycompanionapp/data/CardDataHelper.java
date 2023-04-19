package com.example.escapevelocitycompanionapp.data;

import com.example.escapevelocitycompanionapp.R;
import com.example.escapevelocitycompanionapp.models.Card;

import java.util.ArrayList;

public class CardDataHelper {
    private final ArrayList<Card> gadgetCardsList = new ArrayList<>();
    private final ArrayList<Card> penaltyCardsList = new ArrayList<>();
    private final ArrayList<Card> eventCardsList = new ArrayList<>();

    public CardDataHelper() {
        this.createGadgetCards();
        this.createPenaltyCards();
        this.createEventCards();
    }

    private void createGadgetCards() {
        this.gadgetCardsList.add(new Card("Jetpack", Card.GADGET_CARD, "When used, move three tiles clockwise/forward.", "(Only event tiles are activated by this action.)", R.drawable.img_gadget_jetpack, R.drawable.card_gadget_jetpack));
        this.gadgetCardsList.add(new Card("Prototype v.2 Jetpack", Card.GADGET_CARD, "When used, you must roll a six-sided die and choose three (3) numbers from 1 to 6. If one of the numbers was rolled, move six (6) tiles clockwise. Otherwise, you move two (2) tiles counter-clockwise.", "(Action tiles are NOT activated by this action.)", R.drawable.img_gadget_jetpackv2, R.drawable.card_gadget_jetpackv2));
        this.gadgetCardsList.add(new Card("Unstable Switcheroo", Card.GADGET_CARD, "When used, you may target any other player on the board. You must pick two (2) numbers from 1 to 6; if the correct number is rolled, both players must switch positions. Otherwise, the action is negated, and you must move four (4) tiles counter-clockwise.", "(Action tiles are NOT activated by this action.)", R.drawable.img_gadget_switcheroo, R.drawable.card_gadget_switcheroo));
        this.gadgetCardsList.add(new Card("Teleporter", Card.GADGET_CARD, "When used, you must roll a six-sided die, and whatever number was rolled, you move the same number of tiles clockwise.", "(Only penalty tiles are activated by this action.)", R.drawable.img_gadget_teleporter, R.drawable.card_gadget_teleporter));
        this.gadgetCardsList.add(new Card("Countermeasure", Card.GADGET_CARD, "When used, you may negate the effects of a penalty card.", "(This card may only be used during your “DRIFT” phase.)", R.drawable.img_gadget_countermeasure, R.drawable.card_gadget_countermeasure));
        this.gadgetCardsList.add(new Card("Sleight Hook", Card.GADGET_CARD, "When used, you may take one (1) card from another player.", "(You cannot use the stolen card for that turn and take backs are not allowed.)", R.drawable.img_gadget_sleightofhook, R.drawable.card_gadget_sleightofhook));
        this.gadgetCardsList.add(new Card("Stabilizer Upgrade", Card.GADGET_CARD, "When used, you may skip your turn.", "(You may only use this card during “DECISION” Phase 1.)", R.drawable.img_gadget_stabilizer, R.drawable.card_gadget_stabilizer));
        this.gadgetCardsList.add(new Card("X-ray Goggles", Card.GADGET_CARD, "When used, you may look at each players’ gadget card they’re holding, then look at the top three (3) cards of the gadget deck, then place them back on top of the deck in any order you want.", R.drawable.img_gadget_xraygoggles, R.drawable.card_gadget_xraygoggles));
    }

    private void createPenaltyCards() {
        this.penaltyCardsList.add(new Card("Asteroid", Card.PENALTY_CARD, "Upon activation, the player must roll a six-sided die, and whatever the player rolls, they move double the number of tiles counter-clockwise.", "(Action tiles are NOT activated by this effect.)", R.drawable.img_penalty_asteroid, R.drawable.card_penalty_asteroid));
        this.penaltyCardsList.add(new Card("Ship Debris", Card.PENALTY_CARD, "Upon activation, the player must move five tiles counter-clockwise.", "(Only gadget tiles are activated by this effect.)", R.drawable.img_penalty_shipdebris, R.drawable.card_penalty_shipdebris));
        this.penaltyCardsList.add(new Card("Stabilizer Malfunction", Card.PENALTY_CARD, "Upon activation, the player must choose two (2) numbers from 1 to 6 and roll a six-sided die. When the correct number is rolled, the player moves three (3) tiles clockwise. Otherwise, move eight (8) tiles counter-clockwise.", "(Only event tiles are activated by this effect.)", R.drawable.img_penalty_stabilizermalfunction, R.drawable.card_penalty_stabilizermalfunction));
        this.penaltyCardsList.add(new Card("Repeated Starbursts", Card.PENALTY_CARD, "Upon activation, roll the dice again. Whatever you roll, you move an equal number of tiles counter-clockwise.", "(Only penalty tiles are activated by this effect.)", R.drawable.img_penalty_repeatedstarbursts, R.drawable.card_penalty_repeatedstarbursts));
        this.penaltyCardsList.add(new Card("Heat Wave", Card.PENALTY_CARD, "Upon activation, if you are holding a gadget card, you must discard it. Otherwise, move four (4) tiles counter-clockwise.", "(Only event and penalty tiles are activated by this effect.)", R.drawable.img_penalty_heatwave, R.drawable.card_penalty_heatwaves));
        this.penaltyCardsList.add(new Card("Comet Collision", Card.PENALTY_CARD, "Upon activation, move two (2) tiles counter-clockwise and draw another penalty card.", "(Action tiles are not activated by this effect.)", R.drawable.img_penalty_cometcollision, R.drawable.card_penalty_cometcollision));
        this.penaltyCardsList.add(new Card("Rock and Roll", Card.PENALTY_CARD, "Upon activation, roll a six-sided die. When you get an even number, move eight (8) tiles counter-clockwise. When odd, move four (4) tiles clockwise.", "(Action tiles are NOT activated by this effect.)", R.drawable.img_penalty_rockandroll, R.drawable.card_penalty_rockandroll));
        this.penaltyCardsList.add(new Card("Impulsive Implosion", Card.PENALTY_CARD, "Upon activation, whatever number your recent previous dice roll showed, move the same number of tiles counter-clockwise.", "(Action tiles are NOT activated by this effect.)", R.drawable.img_penalty_impulsiveimplosion, R.drawable.card_penalty_impulsiveimplosion));
    }

    private void createEventCards() {
        this.eventCardsList.add(new Card("Twice Anomaly", Card.EVENT_CARD, "For three (3) rounds, action tiles are inactive and the outcome of the DRIFT phase dice rolls of each player are doubled.", "(Event tiles are inactive during the event.)", R.drawable.img_event_twiceanomaly, R.drawable.card_event_twiceanomaly));
        this.eventCardsList.add(new Card("Detonating Stars", Card.EVENT_CARD, "For three (3) rounds, instead of drawing a penalty card, landing on a penalty tile will require the player to roll a six-sided die. Whenever they get an even number, they move counter-clockwise; otherwise, for odd numbers, they move clockwise. The player will move double whichever number they rolled.", R.drawable.img_event_detonatingstars, R.drawable.card_event_detonatingstars));
        this.eventCardsList.add(new Card("Wishing Star", Card.EVENT_CARD, "For three (3) rounds, all gadget tiles now have the effect: whenever stepped upon, the player must choose three (3) numbers from 1 to 6. If the correct number is rolled, they may select any gadget card they want from the deck before shuffling it. Otherwise, the player must draw a penalty card and activate its effect.", "(Event tiles are inactive during the event.)", R.drawable.img_event_wishingstar, R.drawable.card_event_wishingstar));
        this.eventCardsList.add(new Card("Asteroid Belt", Card.EVENT_CARD, "For three (3) rounds, event tiles are inactive, and whenever a player steps on a penalty tile, the player will not draw any penalty card. Instead, the player must roll a six-sided die twice and move counter-clockwise the same number of tiles.", "(Action tiles are inactive during the event.)", R.drawable.img_event_asteroidbelt, R.drawable.card_event_asteroidbelt));
        this.eventCardsList.add(new Card("Reversed Judgment", Card.EVENT_CARD, "For three (3) rounds, the board is now reversed; whoever reaches the center wins the game instead.", R.drawable.img_event_reversedjudgement, R.drawable.card_event_reversedjudgement));
        this.eventCardsList.add(new Card("Gazing Star", Card.EVENT_CARD, "For three (3) rounds, all decks of cards (Event, Penalty, and Gadget) are flipped so that it will always reveal what’s on top.", R.drawable.img_event_gazingstar, R.drawable.card_event_gazingstar));
        this.eventCardsList.add(new Card("Twisted Fate", Card.EVENT_CARD, "For three (3) rounds, all action tiles and gadget cards that players are currently holding will be inactive and cannot be used. The dice rolls for Wormhole are doubled during the duration of the event.", "(Event tiles are inactive during the event.)", R.drawable.img_event_twistedfate, R.drawable.card_event_twistedfate));
        this.eventCardsList.add(new Card("Supply Crate Bazaar", Card.EVENT_CARD, "When this event activates, all players will be dealt gadget cards until each player has up to three (3) cards in hand. For three (3) rounds, players are only allowed to use one gadget card per turn. Every player must discard all their gadget cards as soon as this event becomes inactive.", "(Gadget and event tiles are inactive during the event.)", R.drawable.img_event_supplycratebazaar, R.drawable.card_event_supplycratebazaar));
    }

    public ArrayList<Card> getGadgetCardsList() {
        return gadgetCardsList;
    }

    public ArrayList<Card> getPenaltyCardsList() {
        return penaltyCardsList;
    }

    public ArrayList<Card> getEventCardsList() {
        return eventCardsList;
    }
}
