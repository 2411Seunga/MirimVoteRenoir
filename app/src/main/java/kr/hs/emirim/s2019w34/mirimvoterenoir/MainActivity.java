package kr.hs.emirim.s2019w34.mirimvoterenoir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] imgNames = {"테라스의 두 자매", "소녀의 모습",  "부채를 든 소녀", "책 읽는 소녀들", "모자를 쓴 두 소녀",
            "피아노레슨", "사람들", "양산을 든 여인", "푸른 들의 소녀와 나그네"};
    int[] voteCount = new int[imgNames.length];
    ImageView[] imgVs = new ImageView[imgNames.length];
    int[] imgVIDs = {R.id.img1, R.id.img2, R.id.img3, R.id.img4, R.id.img5, R.id.img6, R.id.img7, R.id.img8, R.id.img9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < voteCount.length; i++) {
            voteCount[i] = 0;
        }

        for (int i = 0; i < imgVs.length; i++) {
            final int index;
            index = i;
            imgVs[index] = findViewById(imgVIDs[index]);
            imgVs[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    voteCount[index]++;
                    Toast.makeText(getApplicationContext(), imgNames[index] + ": 총 " + voteCount[index] + "표", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}