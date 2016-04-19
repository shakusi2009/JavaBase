import java.util.ArrayList;
import java.util.List;

/**
 * Created by z10613 on 2016/4/18.
 */
public class TupleUtil {
    public static  <A,B> TwoTuple<A,B> tuple(A a, B b)
    {
        return new TwoTuple<A,B>(a,b);
    }

    public static <A,B,C> ThreeTuple<A,B,C> tuple (A a,B b,C c)
    {
        return new ThreeTuple<A,B,C>(a, b, c);
    }

    public static void main(String[] args)
    {
        List<GoodsBean> goods =new ArrayList<GoodsBean>();

        for(int i=1; i<26;i++)
        {
            GoodsBean good =new GoodsBean();
            good.setGoodsId(i);
            goods.add(good);
        }

        Integer totalPropety=47;

        String sb="我是卡卡西";
        ThreeTuple<List<GoodsBean>, Integer, String> twoTuple1=TupleUtil.tuple(goods,totalPropety, sb);

        List<GoodsBean> list = twoTuple1.first;

        System.out.println(list);

        System.out.println("Total:"+twoTuple1.second);

        System.out.println("String:"+sb);
    }
}
