package com.vaadin.tutorial.crm.ui.views.joboffers;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.tutorial.crm.backend.entity.JobOffer;
import com.vaadin.tutorial.crm.backend.service.JobOfferService;
import com.vaadin.tutorial.crm.ui.MainLayout;

@PageTitle("Job Offers | Employer's App")
@Route(value = "joboffer", layout = MainLayout.class)
public class JobOfferDashboard extends VerticalLayout {

    Grid<JobOffer> grid = new Grid<>(JobOffer.class);
    TextField filterText = new TextField();

    H1 header = new H1();

    JobOfferService jobOfferService;

    public JobOfferDashboard(JobOfferService jobOfferService){
        this.jobOfferService = jobOfferService;
        addClassName("joboffer-dashboard");
        setSizeFull();
        configureGrid();
        configureHeader();

        Div head = new Div(header, getToolBar());
        head.addClassName("head");

        Div content = new Div(grid);
        content.addClassName("content");
        content.setSizeFull();

        add(head, content);
    }

    private void configureHeader(){
        header.setText("Job Offer (5)");
        header.addClassName("header");
    }

    private void configureGrid(){
        grid.addClassName("joboffer-grid");
        grid.setSizeFull();
        grid.setColumns("title", "location","deadline","specialRequirements","duration","hourlyRate","status");
        grid.getColumns().forEach(col -> col.setAutoWidth(true));
    }

    private HorizontalLayout getToolBar() {
        filterText.setPlaceholder("Filter by name...");
        filterText.setClearButtonVisible(true);
        filterText.setValueChangeMode(ValueChangeMode.LAZY);

        HorizontalLayout toolbar = new HorizontalLayout(filterText);
        toolbar.addClassName("toolbar");
        return toolbar;
    }
}
