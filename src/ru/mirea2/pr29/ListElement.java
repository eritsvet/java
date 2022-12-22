package ru.mirea2.pr29;

public class ListElement {
    Item item;
    ListElement prevItem;
    ListElement nextItem;

    ListElement(Item item, ListElement parent){
        this.item = item;
        this.prevItem = parent;
    }
}
