package co.yedam.web;

import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.micol.prj.notice.serviceImple.NoticeServiceImpl;
import co.micol.prj.notice.vo.NoticeVO;

public class JacksonTest {
	@Test
	public void toJson() throws JsonProcessingException{
		NoticeServiceImpl service = new NoticeServiceImpl();
		List<NoticeVO> list = service.noticeSelectList();
		
		ObjectMapper objectMapper = new ObjectMapper();
		String result = objectMapper.writeValueAsString(list);
		System.out.println(result);
	}
	@Test
	public void toObject() throws JsonMappingException, JsonProcessingException {
		String str="{\"noticeId\":2,\"noticeWriter\":\"micol\",\"noticeTitle\":\"프로젝트 \",\"noticeSubject\":null,\"noticeDate\":\"2022-07-11\",\"noticeHit\":0,\"noticeAttech\":\"220712.txt\",\"noticeAttechDir\":null}";
		ObjectMapper objectMapper = new ObjectMapper();
		NoticeVO vo = objectMapper.readValue(str, NoticeVO.class);
		System.out.println(vo.getNoticeTitle());
		
	}
}
