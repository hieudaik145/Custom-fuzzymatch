package com.hieuvv.test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.hieuvv.component.MatchService;
import com.hieuvv.composite.Document;
import com.hieuvv.composite.Match;

public class Main {

	public static void main(String[] args) throws ParseException {

		MatchService matchService = new MatchService();

		List<Document> documents = new ArrayList<>();

		documents.addAll(Service.createDocumentForHoatDongTrungTamVanHoa(Service.createListHoatDongCuaTrungTamVanHoa()));
		
		documents.addAll(Service.createDocumentForHoatDongTuyenTruyenLuuDong(Service.createListHoatDongTuyenTruyenLuuDong()));

		Map<Document, List<Match<Document>>> result = matchService.applyMatch(documents);

		List<Match<Document>> listMatch = new ArrayList<Match<Document>>();

		for (Document temp : result.keySet()) {
			listMatch.addAll(result.get(temp));
		}
		
		buildListMatch(listMatch);

		for (Match<Document> match : listMatch) {
			System.out.println(match.getData().getKey().toString());
			System.out.println("match with");
			System.out.println(match.getMatchedWith().getKey().toString());
			System.out.println("Score " + match.getScore().getResult());
			System.out.println("---------");
		}
	}

	private static void buildListMatch(List<Match<Document>> list) {

		for (int i = 0; i < list.size(); i++) {
			Match<Document> first = list.get(i);
			for (int j = i + 1; j < list.size(); j++) {
				Match<Document> last = list.get(j);
				if(last.getMatchedWith().getKey().equals(first.getData().getKey()) && last.getResult() == first.getResult()) {
					list.remove(j);
				}
				 
			}
		}

	}
}
