package com.parser.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JHyperlinkLabel extends JLabel {

    private String url;

    final Color COLOR_NORMAL    = Color.BLUE;
    final Color COLOR_HOVER     = Color.RED;
    final Color COLOR_ACTIVE    = COLOR_NORMAL;
    Color mouseOutDefault;

    public JHyperlinkLabel(String text, String url) {
        super(text);
        this.url = url;
    }

    public JHyperlinkLabel() {
        addMouseListener();
        setForeground(COLOR_NORMAL);
        mouseOutDefault = COLOR_NORMAL;
        this.setSize((int)this.getPreferredSize().getWidth(),(int)this.getPreferredSize().getHeight());
        this.setOpaque(true);
    }

    public void setUrl(String url) {
        this.url = url;
        setText("" + getText() + "");
    }

    public void setText(String text) {
        super.setText(text);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(2,
                getHeight()-1,
                (int)getPreferredSize().getWidth()-2,
                getHeight()-1);
    }

    public void addMouseListener() {

        addMouseListener( new MouseListener() {

            public void mouseClicked(MouseEvent me) {
                setForeground(COLOR_ACTIVE);
                mouseOutDefault = COLOR_ACTIVE;
                Browser.open(getText());
            }

            public void mouseReleased(MouseEvent me) {

            }

            public void mousePressed(MouseEvent me) {
                mouseOutDefault = COLOR_ACTIVE;
            }

            public void mouseEntered(MouseEvent me) {
                setForeground(COLOR_HOVER);
                Cursor cursor = getCursor();
                setCursor(cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent me) {
                setForeground(mouseOutDefault);
                Cursor cursor = getCursor();
                setCursor(cursor.getDefaultCursor());
            }
        });
    }

}