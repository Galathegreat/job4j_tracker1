package ru.job4j.tracker;
import java.util.Arrays;

 public class Tracker {
     private final Item[] items = new Item[100];
     private int ids = 1;
     private int size = 0;

     public Item add(Item item) {
         item.setId(ids++);
         items[size++] = item;
         return item;
     }

     public Item findById(int id) {
         Item rsl = null;
         for (int index = 0; index < size; index++) {
             Item item = items[index];
             if (item.getId() == id) {
                 rsl = item;
                 break;
             }
         }
         return rsl;
     }

     public Item[] findALL() {
         return Arrays.copyOf(items, size);
     }

     public Item[] findByName(String key) {
         Item[] rsl = new Item[size];
         int count = 0;
         for (int i = 0; i < size; i++) {
             if (key.equals(items[i].getName())) {
                 rsl[count] = items[i];
                 count++;
             }
         }
         return Arrays.copyOf(rsl, count);
     }

     private int indexOf(int id) {
         int rsl = -1;
         for (int index = 0; index < size; index++) {
             if (items[index].getId() == id) {
                 rsl = index;
                 break;
             }
         }
         return rsl;
     }

     public boolean replace(int id, Item item) {
         int index = indexOf(id);
         if (index != -1) {
             item.setId(id);
             items[index] = item;
             return true;
         } else {
             System.out.println("ID not found");

         }
         return false;
     }

     public boolean delete(int id) {
         int index = indexOf(id);
         if (index != -1) {
             System.arraycopy(items, index + 1, items, index, size - index - 1);
             items[size - 1] = null;
             size--;
             return true;
         } else {
             System.out.println("ID not found");
         }
         return false;
     }

     public Item[] findAll() {
         return Arrays.copyOf(items, size);
     }
 }

