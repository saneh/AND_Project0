package in.lemonco.myudaciousappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setting the onClickListener of all button in the main activity
        Button project1 = (Button)findViewById(R.id.popular_movies);
        project1.setOnClickListener(new ProjectClick());
        Button project2 = (Button)findViewById(R.id.stock_hawk);
        project2.setOnClickListener(new ProjectClick());
        Button project3 = (Button)findViewById(R.id.build_it_bigger);
        project3.setOnClickListener(new ProjectClick());
        Button project4 = (Button)findViewById(R.id.material_design);
        project4.setOnClickListener(new ProjectClick());
        Button project5 = (Button)findViewById(R.id.go_ubiquitous);
        project5.setOnClickListener(new ProjectClick());
        Button project6 = (Button)findViewById(R.id.capstone);
        project6.setOnClickListener(new ProjectClick());
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
    //inner class that handles the button click event
    private class ProjectClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            //switch statment to take different actions depending on the button clicked
            switch(v.getId()){
                case R.id.popular_movies:
                    Toast.makeText(MainActivity.this,"This button will take you to \"Popular Movies\" app",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.stock_hawk:
                    Toast.makeText(MainActivity.this,"This button will take you to \"Stock Hawk\" app",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.build_it_bigger:
                    Toast.makeText(MainActivity.this,"This button will take you to \"Build it bigger\" app",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.material_design:
                    Toast.makeText(MainActivity.this,"This button will take you to \"Material Design\" app",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.go_ubiquitous:
                    Toast.makeText(MainActivity.this,"This button will take you to \"Go Ubiquitous\" app",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.capstone:
                    Toast.makeText(MainActivity.this,"This button will take you to \"Capstone\" app",Toast.LENGTH_SHORT).show();
                    break;

            }

        }
    }
}
