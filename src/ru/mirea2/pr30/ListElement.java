package ru.mirea2.pr30;

import ru.mirea2.pr29.Item;

public class ListElement {
    MenuItem item;
    ListElement prevItem;
    ListElement nextItem;

    ListElement(MenuItem item, ListElement parent){
        this.item = item;
        this.prevItem = parent;
    }
}
