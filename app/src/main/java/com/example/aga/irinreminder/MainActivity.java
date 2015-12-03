package com.example.aga.irinreminder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/*



Два окна. Перелистывающихся как страницы. На одном просто напоминания, на другом дни рождения.
Соответственно две кнопки. Одна добавить напоминание. Другая добавить день рождения.


 */


public class MainActivity extends AppCompatActivity {

    private ListView reminderList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reminderList = (ListView) findViewById(R.id.ReminderList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.reminders_raw, R.id.rawText,
                new String[]{"first", "second", "third"});

        reminderList.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
