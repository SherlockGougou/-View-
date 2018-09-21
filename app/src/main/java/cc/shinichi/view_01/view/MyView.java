package cc.shinichi.view_01.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import javax.xml.validation.Validator;

/**
 * @author 工藤
 * @email gougou@16fan.com
 * cc.shinichi.view_01.view
 * create at 2018/9/21  15:50
 * description:
 */
public class MyView extends View {

	public MyView(Context context) {
		super(context);
	}

	public MyView(Context context, @Nullable AttributeSet attrs) {
		super(context, attrs);
	}

	public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}


	Paint paint = new Paint();

	@Override protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

		paint.setStyle(Paint.Style.STROKE);// 绘制的类型：填充、描边、填充+描边
		paint.setStrokeWidth(2);// 描边的宽度
		paint.setAntiAlias(true);// 是否开启抗锯齿：true开启；false关闭
		paint.setDither(true);
		paint.setColor(Color.parseColor("#27A0C9"));
		canvas.drawCircle(100, 100, 100, paint);
	}
}
