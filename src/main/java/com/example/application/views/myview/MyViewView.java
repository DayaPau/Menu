package com.example.application.views.myview;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("My View")
@Route(value = "my-view", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class MyViewView extends Composite<VerticalLayout> {

    public MyViewView() {
        H1 h1 = new H1();
        Button buttonSecondary = new Button();
        Button buttonSecondary2 = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        h1.setText("Menu");
        h1.setWidth("max-content");
        buttonSecondary.setText("Menu Donante");
        buttonSecondary.setWidth("min-content");
        buttonSecondary2.setText("Menu Beneficiario");
        buttonSecondary2.setWidth("min-content");
        getContent().add(h1);
        getContent().add(buttonSecondary);
        getContent().add(buttonSecondary2);
    }
}
