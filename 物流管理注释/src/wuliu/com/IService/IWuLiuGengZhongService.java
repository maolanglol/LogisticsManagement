package wuliu.com.IService;

import java.util.List;

import wuliu.com.pojo.WuLiuGenZhongBiao;

public interface IWuLiuGengZhongService {
      public List QueryWuLiuDan();
      public List QueryWuLiuDan(int WangDianID);
      public List QueryWuLiuDanByID(int WuLiuDanID);
      public List QueryWuLiuXianLu(String WuLiuDanBianHao);
      public List QueryWuLiuXianLu(int WuLiuDanID);
      public List QueryProvince();
      public List QueryCity(long provinceID);
      public List QueryDistrict(long cityID);
      public List QueryWangDian(int DistrictID);
      public boolean FaChe(int WuLiuXianLuID);
      public boolean modifyWuLiuGenZhongBiao(WuLiuGenZhongBiao entity) ;
      public List<WuLiuGenZhongBiao> QueryWuLiuGenZhong(int WuLiuDanID);
      public List<WuLiuGenZhongBiao> QueryWuLiuGenZhong(int WuLiuDanID,int ShunXu);
}
