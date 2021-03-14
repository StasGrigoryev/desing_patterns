package org.example.patterns.behavioural.visitor.visitor;

import org.example.patterns.behavioural.visitor.shapes.*;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
