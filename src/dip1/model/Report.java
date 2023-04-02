package dip1.model;

import dip1.model.util.Printer;

import java.util.ArrayList;
import java.util.List;

public class Report{
    private List<ReportItem> items;	// �������� ������

    private final Printer<ReportItem> printer;

    public Report(Printer<ReportItem> printer) {
        this.printer = printer;
    }

    // ������ �������� ������
    public void calculate(){
        items =  new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));
    }

    public void output(){
        printer.output(items);
    }
}
