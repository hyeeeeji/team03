package mini01team03.spot.model;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import mini01team03.cost.model.MarkerVO;

@Repository
@Mapper
public interface SpotDAO {

	public int insertSpot(MarkerVO markerVO) throws SQLException;
	 
}
