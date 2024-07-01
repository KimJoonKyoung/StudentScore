package org.scoula.studentscore;

import org.scoula.lib.cli.App;
import org.scoula.lib.cli.ui.Menu;
import org.scoula.lib.cli.ui.MenuItem;

public class StudentScoreApp2 extends App {
    StudentScoreService service = new StudentScoreService();

    @Override
    public void createMenu(Menu menu) {
        super.createMenu(menu);
        menu.add(new MenuItem("학생수", service::initScores));
        menu.add(new MenuItem("점수입력", service::getScores));
        menu.add(new MenuItem("점수리스트", service::printScores));
        menu.add(new MenuItem("분석", service::analize));
    }

    public static void main(final String[] args) {
        App app = new StudentScoreApp2();
        app.run();
    }
}

