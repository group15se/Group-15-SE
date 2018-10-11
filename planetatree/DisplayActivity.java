package blake.planetatree;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayActivity extends AppCompatActivity {
    private TextView name;
    private TextView number;
    private String treename;
    private double price = 19.99;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent i = getIntent();

        treename =i.getStringExtra("data");

        name = (TextView) findViewById(R.id.Treename);
        name.setText(treename);

        number = (TextView)findViewById(R.id.treenumber);

        findViewById(R.id.increase).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberpicker = Integer.parseInt(number.getText().toString()) + 1;
                String n = Integer.toString(numberpicker);
                number.setText(n);
            }
        });

        findViewById(R.id.decrease).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberpicker = Integer.parseInt(number.getText().toString()) - 1;
                String n = Integer.toString(numberpicker);
                number.setText(n);
            }
        });


        findViewById(R.id.purchase).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberpicker = Integer.parseInt(number.getText().toString());
                Intent i = new Intent(DisplayActivity.this,PurchaseActivity.class);
                i.putExtra("number",numberpicker);
                i.putExtra("price",price);
                startActivity(i);
            }
        });





    }
}
