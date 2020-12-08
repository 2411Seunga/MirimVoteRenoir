package kr.hs.emirim.s2019w34.mirimvoterenoir;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class GridAdapter extends BaseAdapter {
    Context context;
    String[] imgNames = {"테라스의 두 자매", "소녀의 모습",  "부채를 든 소녀", "책 읽는 소녀들", "모자를 쓴 두 소녀",
            "피아노레슨", "사람들", "양산을 든 여인", "푸른 들의 소녀와 나그네"};
    int[] imgVIDs = {R.id.img1, R.id.img2, R.id.img3, R.id.img4, R.id.img5, R.id.img6, R.id.img7, R.id.img8, R.id.img9};
    int[] voteCount = new int[imgNames.length];

    public GridAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return imgNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new GridView.LayoutParams(350, 450));
        imgv.setAdjustViewBounds(true);
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(10, 10, 10, 10);
        imgv.setImageResource(imgVIDs[position]);
        for (int i = 0; i < voteCount.length; i++) {
            voteCount[i] = 0;
        }
        final int pos = position;
        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voteCount[pos]++;
                Toast.makeText(context, imgNames[pos] + ": 총  +" + voteCount[pos] + "표", Toast.LENGTH_LONG).show();
            }
        });
        return imgv;
    }
}
