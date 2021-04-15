package com.vaadin.tutorial.crm.ui.views.joboffers;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.BigDecimalField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.tutorial.crm.backend.entity.JobOffer;
import com.vaadin.tutorial.crm.ui.MainLayout;

public class JobOfferForm extends FormLayout {

    TextField title = new TextField("Title");
    TextField location = new TextField("Location");
    DatePicker deadline = new DatePicker("Deadline");
    TextArea specialReq = new TextArea("Special Requirements");
    BigDecimalField duration = new BigDecimalField("Duration");
    BigDecimalField hourlyRate = new BigDecimalField("Hourly Rate");

    Button save = new Button("Save");
    Button delete = new Button("Delete");
    Button close = new Button("Cancel");

    Binder<JobOffer> binder = new BeanValidationBinder<>(JobOffer.class);
    private JobOffer jobOffer;

    public JobOfferForm(){
        addClassName("joboffer-form");
        hourlyRate.setPrefixComponent(new Icon(VaadinIcon.DOLLAR));
        binder.bindInstanceFields(this);

        add(
                title,
                location,
                deadline,
                specialReq,
                duration,
                hourlyRate,
                createButtonsLayout()
        );
    }

    private Component createButtonsLayout() {
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        delete.addThemeVariants(ButtonVariant.LUMO_ERROR);
        close.addThemeVariants(ButtonVariant.LUMO_TERTIARY);

        save.addClickShortcut(Key.ENTER);
        close.addClickShortcut(Key.ESCAPE);

        binder.addStatusChangeListener(evt -> save.setEnabled(binder.isValid()));

        return new HorizontalLayout(save, delete, close);
    }

}
