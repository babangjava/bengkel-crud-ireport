/*
 * Created on 25 Jul 2021 ( Time 02:07:42 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.business.service.mapping;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;
import org.demo.bean.PembelianHeader;
import org.demo.bean.jpa.PembelianHeaderEntity;
import org.demo.test.MockValues;

/**
 * Test : Mapping between entity beans and display beans.
 */
public class PembelianHeaderServiceMapperTest {

	private PembelianHeaderServiceMapper pembelianHeaderServiceMapper;

	private static ModelMapper modelMapper = new ModelMapper();

	private MockValues mockValues = new MockValues();
	
	
	@BeforeClass
	public static void setUp() {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}
	
	@Before
	public void before() {
		pembelianHeaderServiceMapper = new PembelianHeaderServiceMapper();
		pembelianHeaderServiceMapper.setModelMapper(modelMapper);
	}
	
	/**
	 * Mapping from 'PembelianHeaderEntity' to 'PembelianHeader'
	 * @param pembelianHeaderEntity
	 */
	@Test
	public void testMapPembelianHeaderEntityToPembelianHeader() {
		// Given
		PembelianHeaderEntity pembelianHeaderEntity = new PembelianHeaderEntity();
		pembelianHeaderEntity.setTanggal(mockValues.nextDate());
		pembelianHeaderEntity.setSupplier(mockValues.nextString(100));
		pembelianHeaderEntity.setTotal(mockValues.nextDouble());
		
		// When
		PembelianHeader pembelianHeader = pembelianHeaderServiceMapper.mapPembelianHeaderEntityToPembelianHeader(pembelianHeaderEntity);
		
		// Then
		assertEquals(pembelianHeaderEntity.getTanggal(), pembelianHeader.getTanggal());
		assertEquals(pembelianHeaderEntity.getSupplier(), pembelianHeader.getSupplier());
		assertEquals(pembelianHeaderEntity.getTotal(), pembelianHeader.getTotal());
	}
	
	/**
	 * Test : Mapping from 'PembelianHeader' to 'PembelianHeaderEntity'
	 */
	@Test
	public void testMapPembelianHeaderToPembelianHeaderEntity() {
		// Given
		PembelianHeader pembelianHeader = new PembelianHeader();
		pembelianHeader.setTanggal(mockValues.nextDate());
		pembelianHeader.setSupplier(mockValues.nextString(100));
		pembelianHeader.setTotal(mockValues.nextDouble());

		PembelianHeaderEntity pembelianHeaderEntity = new PembelianHeaderEntity();
		
		// When
		pembelianHeaderServiceMapper.mapPembelianHeaderToPembelianHeaderEntity(pembelianHeader, pembelianHeaderEntity);
		
		// Then
		assertEquals(pembelianHeader.getTanggal(), pembelianHeaderEntity.getTanggal());
		assertEquals(pembelianHeader.getSupplier(), pembelianHeaderEntity.getSupplier());
		assertEquals(pembelianHeader.getTotal(), pembelianHeaderEntity.getTotal());
	}

}