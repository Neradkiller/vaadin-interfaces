package com.vaadin.tutorial.crm.ui.views.joboffers;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.tutorial.crm.ui.MainLayout;

@PageTitle("Job Offer Edit | Employer's app")
@Route(value = "jobofferedit", layout = MainLayout.class)
public class JobOfferEdit extends VerticalLayout {

    JobOfferForm form;

    public JobOfferEdit(){
        addClassName("joboffer-edit");
        setSizeFull();

        form = new JobOfferForm();

        Div content = new Div(form);
        content.addClassName("content");
        content.setSizeFull();

        add(content);

    }
}
