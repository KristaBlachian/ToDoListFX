package com.theironyard.todolist;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;

    public void initialize() {
      TodoItem item1 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for John",
              LocalDate.of(2018, Month.DECEMBER, 25));
        TodoItem item2 = new TodoItem("Doctor's appointment", "See Dr.Smith at 123 Main st",
                LocalDate.of(2019, Month.JANUARY, 23));
        TodoItem item3 = new TodoItem("Finish design proposal for client", "I promised Mike I'd email website mockups by Friday 22nd April",
                LocalDate.of(2019, Month.APRIL, 22));
        TodoItem item4 = new TodoItem("Pickup Doug at the train station", "Doug's arriving March 23 on the 5:00 train",
                LocalDate.of(2018, Month.MARCH, 23));
        TodoItem item5 = new TodoItem("Pickup dry cleaning", "Clothes should be ready by Wednesday",
                LocalDate.of(2018, Month.DECEMBER, 20));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);
    }
}
