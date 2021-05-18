package com.kazale.pontointeligente.services.impl

import com.kazale.pontointeligente.documents.Empresa
import com.kazale.pontointeligente.repositories.EmpresaRepository
import com.kazale.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl (val empresaRepository: EmpresaRepository) : EmpresaService {

  override fun buscarPorCnpj(cnpj: String) = empresaRepository.findByCnpj(cnpj)

  override fun persistir(empresa: Empresa) = empresaRepository.save(empresa)

}