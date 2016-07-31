/*
 * 
 */
package crystal.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import crystal.CrystalPackage;
import crystal.diagram.edit.parts.AnonymousBlockNameEditPart;
import crystal.diagram.edit.parts.CallFunctionDescription2EditPart;
import crystal.diagram.edit.parts.CallFunctionDescription3EditPart;
import crystal.diagram.edit.parts.CallFunctionDescriptionEditPart;
import crystal.diagram.edit.parts.CallProcedureDescription2EditPart;
import crystal.diagram.edit.parts.CallProcedureDescription3EditPart;
import crystal.diagram.edit.parts.CallProcedureDescriptionEditPart;
import crystal.diagram.edit.parts.CaseDescription2EditPart;
import crystal.diagram.edit.parts.CaseDescription3EditPart;
import crystal.diagram.edit.parts.CaseDescriptionEditPart;
import crystal.diagram.edit.parts.CloseDescription2EditPart;
import crystal.diagram.edit.parts.CloseDescription3EditPart;
import crystal.diagram.edit.parts.CloseDescriptionEditPart;
import crystal.diagram.edit.parts.CollectionsName2EditPart;
import crystal.diagram.edit.parts.CollectionsName3EditPart;
import crystal.diagram.edit.parts.CollectionsName4EditPart;
import crystal.diagram.edit.parts.CollectionsName5EditPart;
import crystal.diagram.edit.parts.CollectionsName6EditPart;
import crystal.diagram.edit.parts.CollectionsNameEditPart;
import crystal.diagram.edit.parts.CursorName2EditPart;
import crystal.diagram.edit.parts.CursorName3EditPart;
import crystal.diagram.edit.parts.CursorName4EditPart;
import crystal.diagram.edit.parts.CursorName5EditPart;
import crystal.diagram.edit.parts.CursorName6EditPart;
import crystal.diagram.edit.parts.CursorNameEditPart;
import crystal.diagram.edit.parts.DataTypeName2EditPart;
import crystal.diagram.edit.parts.DataTypeName3EditPart;
import crystal.diagram.edit.parts.DataTypeName4EditPart;
import crystal.diagram.edit.parts.DataTypeName5EditPart;
import crystal.diagram.edit.parts.DataTypeName6EditPart;
import crystal.diagram.edit.parts.DataTypeNameEditPart;
import crystal.diagram.edit.parts.DeleteDescription2EditPart;
import crystal.diagram.edit.parts.DeleteDescription3EditPart;
import crystal.diagram.edit.parts.DeleteDescriptionEditPart;
import crystal.diagram.edit.parts.ExceptionDescription2EditPart;
import crystal.diagram.edit.parts.ExceptionDescription3EditPart;
import crystal.diagram.edit.parts.ExceptionDescriptionEditPart;
import crystal.diagram.edit.parts.FetchDescription2EditPart;
import crystal.diagram.edit.parts.FetchDescription3EditPart;
import crystal.diagram.edit.parts.FetchDescriptionEditPart;
import crystal.diagram.edit.parts.ForDescription2EditPart;
import crystal.diagram.edit.parts.ForDescription3EditPart;
import crystal.diagram.edit.parts.ForDescriptionEditPart;
import crystal.diagram.edit.parts.FunctionNameEditPart;
import crystal.diagram.edit.parts.IfDescription2EditPart;
import crystal.diagram.edit.parts.IfDescription3EditPart;
import crystal.diagram.edit.parts.IfDescriptionEditPart;
import crystal.diagram.edit.parts.InsertDescription2EditPart;
import crystal.diagram.edit.parts.InsertDescription3EditPart;
import crystal.diagram.edit.parts.InsertDescriptionEditPart;
import crystal.diagram.edit.parts.LoopDescription2EditPart;
import crystal.diagram.edit.parts.LoopDescription3EditPart;
import crystal.diagram.edit.parts.LoopDescriptionEditPart;
import crystal.diagram.edit.parts.OpenDescription2EditPart;
import crystal.diagram.edit.parts.OpenDescription3EditPart;
import crystal.diagram.edit.parts.OpenDescriptionEditPart;
import crystal.diagram.edit.parts.ProcedureNameEditPart;
import crystal.diagram.edit.parts.RecordsName2EditPart;
import crystal.diagram.edit.parts.RecordsName3EditPart;
import crystal.diagram.edit.parts.RecordsName4EditPart;
import crystal.diagram.edit.parts.RecordsName5EditPart;
import crystal.diagram.edit.parts.RecordsName6EditPart;
import crystal.diagram.edit.parts.RecordsNameEditPart;
import crystal.diagram.edit.parts.SelectDescription2EditPart;
import crystal.diagram.edit.parts.SelectDescription3EditPart;
import crystal.diagram.edit.parts.SelectDescriptionEditPart;
import crystal.diagram.edit.parts.UpdateDescription2EditPart;
import crystal.diagram.edit.parts.UpdateDescription3EditPart;
import crystal.diagram.edit.parts.UpdateDescriptionEditPart;
import crystal.diagram.edit.parts.WhileDescription2EditPart;
import crystal.diagram.edit.parts.WhileDescription3EditPart;
import crystal.diagram.edit.parts.WhileDescriptionEditPart;
import crystal.diagram.parsers.MessageFormatParser;
import crystal.diagram.part.CrystalVisualIDRegistry;

/**
 * @generated
 */
public class CrystalParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser procedureName_5057Parser;

	/**
	* @generated
	*/
	private IParser getProcedureName_5057Parser() {
		if (procedureName_5057Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getSubprograms_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			procedureName_5057Parser = parser;
		}
		return procedureName_5057Parser;
	}

	/**
	* @generated
	*/
	private IParser functionName_5058Parser;

	/**
	* @generated
	*/
	private IParser getFunctionName_5058Parser() {
		if (functionName_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getSubprograms_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			functionName_5058Parser = parser;
		}
		return functionName_5058Parser;
	}

	/**
	* @generated
	*/
	private IParser anonymousBlockName_5059Parser;

	/**
	* @generated
	*/
	private IParser getAnonymousBlockName_5059Parser() {
		if (anonymousBlockName_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getSubprograms_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			anonymousBlockName_5059Parser = parser;
		}
		return anonymousBlockName_5059Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataTypeName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getDataTypeName_5018Parser() {
		if (dataTypeName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeName_5018Parser = parser;
		}
		return dataTypeName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser collectionsName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getCollectionsName_5019Parser() {
		if (collectionsName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collectionsName_5019Parser = parser;
		}
		return collectionsName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser recordsName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getRecordsName_5020Parser() {
		if (recordsName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			recordsName_5020Parser = parser;
		}
		return recordsName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser cursorName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getCursorName_5021Parser() {
		if (cursorName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cursorName_5021Parser = parser;
		}
		return cursorName_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser dataTypeName_5060Parser;

	/**
	* @generated
	*/
	private IParser getDataTypeName_5060Parser() {
		if (dataTypeName_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeName_5060Parser = parser;
		}
		return dataTypeName_5060Parser;
	}

	/**
	* @generated
	*/
	private IParser collectionsName_5061Parser;

	/**
	* @generated
	*/
	private IParser getCollectionsName_5061Parser() {
		if (collectionsName_5061Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collectionsName_5061Parser = parser;
		}
		return collectionsName_5061Parser;
	}

	/**
	* @generated
	*/
	private IParser recordsName_5062Parser;

	/**
	* @generated
	*/
	private IParser getRecordsName_5062Parser() {
		if (recordsName_5062Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			recordsName_5062Parser = parser;
		}
		return recordsName_5062Parser;
	}

	/**
	* @generated
	*/
	private IParser cursorName_5063Parser;

	/**
	* @generated
	*/
	private IParser getCursorName_5063Parser() {
		if (cursorName_5063Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cursorName_5063Parser = parser;
		}
		return cursorName_5063Parser;
	}

	/**
	* @generated
	*/
	private IParser exceptionDescription_5064Parser;

	/**
	* @generated
	*/
	private IParser getExceptionDescription_5064Parser() {
		if (exceptionDescription_5064Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exceptionDescription_5064Parser = parser;
		}
		return exceptionDescription_5064Parser;
	}

	/**
	* @generated
	*/
	private IParser ifDescription_5065Parser;

	/**
	* @generated
	*/
	private IParser getIfDescription_5065Parser() {
		if (ifDescription_5065Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifDescription_5065Parser = parser;
		}
		return ifDescription_5065Parser;
	}

	/**
	* @generated
	*/
	private IParser caseDescription_5066Parser;

	/**
	* @generated
	*/
	private IParser getCaseDescription_5066Parser() {
		if (caseDescription_5066Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caseDescription_5066Parser = parser;
		}
		return caseDescription_5066Parser;
	}

	/**
	* @generated
	*/
	private IParser insertDescription_5067Parser;

	/**
	* @generated
	*/
	private IParser getInsertDescription_5067Parser() {
		if (insertDescription_5067Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			insertDescription_5067Parser = parser;
		}
		return insertDescription_5067Parser;
	}

	/**
	* @generated
	*/
	private IParser updateDescription_5068Parser;

	/**
	* @generated
	*/
	private IParser getUpdateDescription_5068Parser() {
		if (updateDescription_5068Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateDescription_5068Parser = parser;
		}
		return updateDescription_5068Parser;
	}

	/**
	* @generated
	*/
	private IParser deleteDescription_5069Parser;

	/**
	* @generated
	*/
	private IParser getDeleteDescription_5069Parser() {
		if (deleteDescription_5069Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteDescription_5069Parser = parser;
		}
		return deleteDescription_5069Parser;
	}

	/**
	* @generated
	*/
	private IParser selectDescription_5070Parser;

	/**
	* @generated
	*/
	private IParser getSelectDescription_5070Parser() {
		if (selectDescription_5070Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectDescription_5070Parser = parser;
		}
		return selectDescription_5070Parser;
	}

	/**
	* @generated
	*/
	private IParser whileDescription_5071Parser;

	/**
	* @generated
	*/
	private IParser getWhileDescription_5071Parser() {
		if (whileDescription_5071Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			whileDescription_5071Parser = parser;
		}
		return whileDescription_5071Parser;
	}

	/**
	* @generated
	*/
	private IParser forDescription_5072Parser;

	/**
	* @generated
	*/
	private IParser getForDescription_5072Parser() {
		if (forDescription_5072Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			forDescription_5072Parser = parser;
		}
		return forDescription_5072Parser;
	}

	/**
	* @generated
	*/
	private IParser loopDescription_5073Parser;

	/**
	* @generated
	*/
	private IParser getLoopDescription_5073Parser() {
		if (loopDescription_5073Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loopDescription_5073Parser = parser;
		}
		return loopDescription_5073Parser;
	}

	/**
	* @generated
	*/
	private IParser openDescription_5074Parser;

	/**
	* @generated
	*/
	private IParser getOpenDescription_5074Parser() {
		if (openDescription_5074Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			openDescription_5074Parser = parser;
		}
		return openDescription_5074Parser;
	}

	/**
	* @generated
	*/
	private IParser fetchDescription_5075Parser;

	/**
	* @generated
	*/
	private IParser getFetchDescription_5075Parser() {
		if (fetchDescription_5075Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fetchDescription_5075Parser = parser;
		}
		return fetchDescription_5075Parser;
	}

	/**
	* @generated
	*/
	private IParser closeDescription_5076Parser;

	/**
	* @generated
	*/
	private IParser getCloseDescription_5076Parser() {
		if (closeDescription_5076Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			closeDescription_5076Parser = parser;
		}
		return closeDescription_5076Parser;
	}

	/**
	* @generated
	*/
	private IParser callProcedureDescription_5077Parser;

	/**
	* @generated
	*/
	private IParser getCallProcedureDescription_5077Parser() {
		if (callProcedureDescription_5077Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callProcedureDescription_5077Parser = parser;
		}
		return callProcedureDescription_5077Parser;
	}

	/**
	* @generated
	*/
	private IParser callFunctionDescription_5078Parser;

	/**
	* @generated
	*/
	private IParser getCallFunctionDescription_5078Parser() {
		if (callFunctionDescription_5078Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callFunctionDescription_5078Parser = parser;
		}
		return callFunctionDescription_5078Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataTypeName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getDataTypeName_5023Parser() {
		if (dataTypeName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeName_5023Parser = parser;
		}
		return dataTypeName_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser collectionsName_5024Parser;

	/**
	 * @generated
	 */
	private IParser getCollectionsName_5024Parser() {
		if (collectionsName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collectionsName_5024Parser = parser;
		}
		return collectionsName_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser recordsName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getRecordsName_5025Parser() {
		if (recordsName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			recordsName_5025Parser = parser;
		}
		return recordsName_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser cursorName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getCursorName_5026Parser() {
		if (cursorName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cursorName_5026Parser = parser;
		}
		return cursorName_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataTypeName_5027Parser;

	/**
	 * @generated
	 */
	private IParser getDataTypeName_5027Parser() {
		if (dataTypeName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeName_5027Parser = parser;
		}
		return dataTypeName_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser collectionsName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getCollectionsName_5028Parser() {
		if (collectionsName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collectionsName_5028Parser = parser;
		}
		return collectionsName_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser recordsName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getRecordsName_5029Parser() {
		if (recordsName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			recordsName_5029Parser = parser;
		}
		return recordsName_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser cursorName_5030Parser;

	/**
	 * @generated
	 */
	private IParser getCursorName_5030Parser() {
		if (cursorName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cursorName_5030Parser = parser;
		}
		return cursorName_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser dataTypeName_5079Parser;

	/**
	* @generated
	*/
	private IParser getDataTypeName_5079Parser() {
		if (dataTypeName_5079Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeName_5079Parser = parser;
		}
		return dataTypeName_5079Parser;
	}

	/**
	* @generated
	*/
	private IParser collectionsName_5080Parser;

	/**
	* @generated
	*/
	private IParser getCollectionsName_5080Parser() {
		if (collectionsName_5080Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collectionsName_5080Parser = parser;
		}
		return collectionsName_5080Parser;
	}

	/**
	* @generated
	*/
	private IParser recordsName_5081Parser;

	/**
	* @generated
	*/
	private IParser getRecordsName_5081Parser() {
		if (recordsName_5081Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			recordsName_5081Parser = parser;
		}
		return recordsName_5081Parser;
	}

	/**
	* @generated
	*/
	private IParser cursorName_5082Parser;

	/**
	* @generated
	*/
	private IParser getCursorName_5082Parser() {
		if (cursorName_5082Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cursorName_5082Parser = parser;
		}
		return cursorName_5082Parser;
	}

	/**
	* @generated
	*/
	private IParser exceptionDescription_5083Parser;

	/**
	* @generated
	*/
	private IParser getExceptionDescription_5083Parser() {
		if (exceptionDescription_5083Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exceptionDescription_5083Parser = parser;
		}
		return exceptionDescription_5083Parser;
	}

	/**
	* @generated
	*/
	private IParser ifDescription_5084Parser;

	/**
	* @generated
	*/
	private IParser getIfDescription_5084Parser() {
		if (ifDescription_5084Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifDescription_5084Parser = parser;
		}
		return ifDescription_5084Parser;
	}

	/**
	* @generated
	*/
	private IParser caseDescription_5085Parser;

	/**
	* @generated
	*/
	private IParser getCaseDescription_5085Parser() {
		if (caseDescription_5085Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caseDescription_5085Parser = parser;
		}
		return caseDescription_5085Parser;
	}

	/**
	* @generated
	*/
	private IParser insertDescription_5086Parser;

	/**
	* @generated
	*/
	private IParser getInsertDescription_5086Parser() {
		if (insertDescription_5086Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			insertDescription_5086Parser = parser;
		}
		return insertDescription_5086Parser;
	}

	/**
	* @generated
	*/
	private IParser updateDescription_5087Parser;

	/**
	* @generated
	*/
	private IParser getUpdateDescription_5087Parser() {
		if (updateDescription_5087Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateDescription_5087Parser = parser;
		}
		return updateDescription_5087Parser;
	}

	/**
	* @generated
	*/
	private IParser deleteDescription_5088Parser;

	/**
	* @generated
	*/
	private IParser getDeleteDescription_5088Parser() {
		if (deleteDescription_5088Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteDescription_5088Parser = parser;
		}
		return deleteDescription_5088Parser;
	}

	/**
	* @generated
	*/
	private IParser selectDescription_5089Parser;

	/**
	* @generated
	*/
	private IParser getSelectDescription_5089Parser() {
		if (selectDescription_5089Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectDescription_5089Parser = parser;
		}
		return selectDescription_5089Parser;
	}

	/**
	* @generated
	*/
	private IParser whileDescription_5090Parser;

	/**
	* @generated
	*/
	private IParser getWhileDescription_5090Parser() {
		if (whileDescription_5090Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			whileDescription_5090Parser = parser;
		}
		return whileDescription_5090Parser;
	}

	/**
	* @generated
	*/
	private IParser forDescription_5091Parser;

	/**
	* @generated
	*/
	private IParser getForDescription_5091Parser() {
		if (forDescription_5091Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			forDescription_5091Parser = parser;
		}
		return forDescription_5091Parser;
	}

	/**
	* @generated
	*/
	private IParser loopDescription_5092Parser;

	/**
	* @generated
	*/
	private IParser getLoopDescription_5092Parser() {
		if (loopDescription_5092Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loopDescription_5092Parser = parser;
		}
		return loopDescription_5092Parser;
	}

	/**
	* @generated
	*/
	private IParser openDescription_5093Parser;

	/**
	* @generated
	*/
	private IParser getOpenDescription_5093Parser() {
		if (openDescription_5093Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			openDescription_5093Parser = parser;
		}
		return openDescription_5093Parser;
	}

	/**
	* @generated
	*/
	private IParser fetchDescription_5094Parser;

	/**
	* @generated
	*/
	private IParser getFetchDescription_5094Parser() {
		if (fetchDescription_5094Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fetchDescription_5094Parser = parser;
		}
		return fetchDescription_5094Parser;
	}

	/**
	* @generated
	*/
	private IParser closeDescription_5095Parser;

	/**
	* @generated
	*/
	private IParser getCloseDescription_5095Parser() {
		if (closeDescription_5095Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			closeDescription_5095Parser = parser;
		}
		return closeDescription_5095Parser;
	}

	/**
	* @generated
	*/
	private IParser callProcedureDescription_5096Parser;

	/**
	* @generated
	*/
	private IParser getCallProcedureDescription_5096Parser() {
		if (callProcedureDescription_5096Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callProcedureDescription_5096Parser = parser;
		}
		return callProcedureDescription_5096Parser;
	}

	/**
	* @generated
	*/
	private IParser callFunctionDescription_5097Parser;

	/**
	* @generated
	*/
	private IParser getCallFunctionDescription_5097Parser() {
		if (callFunctionDescription_5097Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callFunctionDescription_5097Parser = parser;
		}
		return callFunctionDescription_5097Parser;
	}

	/**
	* @generated
	*/
	private IParser dataTypeName_5037Parser;

	/**
	* @generated
	*/
	private IParser getDataTypeName_5037Parser() {
		if (dataTypeName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeName_5037Parser = parser;
		}
		return dataTypeName_5037Parser;
	}

	/**
	* @generated
	*/
	private IParser collectionsName_5038Parser;

	/**
	* @generated
	*/
	private IParser getCollectionsName_5038Parser() {
		if (collectionsName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collectionsName_5038Parser = parser;
		}
		return collectionsName_5038Parser;
	}

	/**
	* @generated
	*/
	private IParser recordsName_5039Parser;

	/**
	* @generated
	*/
	private IParser getRecordsName_5039Parser() {
		if (recordsName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			recordsName_5039Parser = parser;
		}
		return recordsName_5039Parser;
	}

	/**
	* @generated
	*/
	private IParser cursorName_5040Parser;

	/**
	* @generated
	*/
	private IParser getCursorName_5040Parser() {
		if (cursorName_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getParameters_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cursorName_5040Parser = parser;
		}
		return cursorName_5040Parser;
	}

	/**
	* @generated
	*/
	private IParser exceptionDescription_5041Parser;

	/**
	* @generated
	*/
	private IParser getExceptionDescription_5041Parser() {
		if (exceptionDescription_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exceptionDescription_5041Parser = parser;
		}
		return exceptionDescription_5041Parser;
	}

	/**
	* @generated
	*/
	private IParser ifDescription_5042Parser;

	/**
	* @generated
	*/
	private IParser getIfDescription_5042Parser() {
		if (ifDescription_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifDescription_5042Parser = parser;
		}
		return ifDescription_5042Parser;
	}

	/**
	* @generated
	*/
	private IParser caseDescription_5043Parser;

	/**
	* @generated
	*/
	private IParser getCaseDescription_5043Parser() {
		if (caseDescription_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caseDescription_5043Parser = parser;
		}
		return caseDescription_5043Parser;
	}

	/**
	* @generated
	*/
	private IParser insertDescription_5044Parser;

	/**
	* @generated
	*/
	private IParser getInsertDescription_5044Parser() {
		if (insertDescription_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			insertDescription_5044Parser = parser;
		}
		return insertDescription_5044Parser;
	}

	/**
	* @generated
	*/
	private IParser updateDescription_5045Parser;

	/**
	* @generated
	*/
	private IParser getUpdateDescription_5045Parser() {
		if (updateDescription_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateDescription_5045Parser = parser;
		}
		return updateDescription_5045Parser;
	}

	/**
	* @generated
	*/
	private IParser deleteDescription_5046Parser;

	/**
	* @generated
	*/
	private IParser getDeleteDescription_5046Parser() {
		if (deleteDescription_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteDescription_5046Parser = parser;
		}
		return deleteDescription_5046Parser;
	}

	/**
	* @generated
	*/
	private IParser selectDescription_5047Parser;

	/**
	* @generated
	*/
	private IParser getSelectDescription_5047Parser() {
		if (selectDescription_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectDescription_5047Parser = parser;
		}
		return selectDescription_5047Parser;
	}

	/**
	* @generated
	*/
	private IParser whileDescription_5048Parser;

	/**
	* @generated
	*/
	private IParser getWhileDescription_5048Parser() {
		if (whileDescription_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			whileDescription_5048Parser = parser;
		}
		return whileDescription_5048Parser;
	}

	/**
	* @generated
	*/
	private IParser forDescription_5049Parser;

	/**
	* @generated
	*/
	private IParser getForDescription_5049Parser() {
		if (forDescription_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			forDescription_5049Parser = parser;
		}
		return forDescription_5049Parser;
	}

	/**
	* @generated
	*/
	private IParser loopDescription_5050Parser;

	/**
	* @generated
	*/
	private IParser getLoopDescription_5050Parser() {
		if (loopDescription_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loopDescription_5050Parser = parser;
		}
		return loopDescription_5050Parser;
	}

	/**
	* @generated
	*/
	private IParser openDescription_5051Parser;

	/**
	* @generated
	*/
	private IParser getOpenDescription_5051Parser() {
		if (openDescription_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			openDescription_5051Parser = parser;
		}
		return openDescription_5051Parser;
	}

	/**
	* @generated
	*/
	private IParser fetchDescription_5052Parser;

	/**
	* @generated
	*/
	private IParser getFetchDescription_5052Parser() {
		if (fetchDescription_5052Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fetchDescription_5052Parser = parser;
		}
		return fetchDescription_5052Parser;
	}

	/**
	* @generated
	*/
	private IParser closeDescription_5053Parser;

	/**
	* @generated
	*/
	private IParser getCloseDescription_5053Parser() {
		if (closeDescription_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			closeDescription_5053Parser = parser;
		}
		return closeDescription_5053Parser;
	}

	/**
	* @generated
	*/
	private IParser callProcedureDescription_5054Parser;

	/**
	* @generated
	*/
	private IParser getCallProcedureDescription_5054Parser() {
		if (callProcedureDescription_5054Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callProcedureDescription_5054Parser = parser;
		}
		return callProcedureDescription_5054Parser;
	}

	/**
	* @generated
	*/
	private IParser callFunctionDescription_5055Parser;

	/**
	* @generated
	*/
	private IParser getCallFunctionDescription_5055Parser() {
		if (callFunctionDescription_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callFunctionDescription_5055Parser = parser;
		}
		return callFunctionDescription_5055Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ProcedureNameEditPart.VISUAL_ID:
			return getProcedureName_5057Parser();
		case FunctionNameEditPart.VISUAL_ID:
			return getFunctionName_5058Parser();
		case AnonymousBlockNameEditPart.VISUAL_ID:
			return getAnonymousBlockName_5059Parser();
		case DataTypeNameEditPart.VISUAL_ID:
			return getDataTypeName_5018Parser();
		case CollectionsNameEditPart.VISUAL_ID:
			return getCollectionsName_5019Parser();
		case RecordsNameEditPart.VISUAL_ID:
			return getRecordsName_5020Parser();
		case CursorNameEditPart.VISUAL_ID:
			return getCursorName_5021Parser();
		case DataTypeName2EditPart.VISUAL_ID:
			return getDataTypeName_5060Parser();
		case CollectionsName2EditPart.VISUAL_ID:
			return getCollectionsName_5061Parser();
		case RecordsName2EditPart.VISUAL_ID:
			return getRecordsName_5062Parser();
		case CursorName2EditPart.VISUAL_ID:
			return getCursorName_5063Parser();
		case ExceptionDescriptionEditPart.VISUAL_ID:
			return getExceptionDescription_5064Parser();
		case IfDescriptionEditPart.VISUAL_ID:
			return getIfDescription_5065Parser();
		case CaseDescriptionEditPart.VISUAL_ID:
			return getCaseDescription_5066Parser();
		case InsertDescriptionEditPart.VISUAL_ID:
			return getInsertDescription_5067Parser();
		case UpdateDescriptionEditPart.VISUAL_ID:
			return getUpdateDescription_5068Parser();
		case DeleteDescriptionEditPart.VISUAL_ID:
			return getDeleteDescription_5069Parser();
		case SelectDescriptionEditPart.VISUAL_ID:
			return getSelectDescription_5070Parser();
		case WhileDescriptionEditPart.VISUAL_ID:
			return getWhileDescription_5071Parser();
		case ForDescriptionEditPart.VISUAL_ID:
			return getForDescription_5072Parser();
		case LoopDescriptionEditPart.VISUAL_ID:
			return getLoopDescription_5073Parser();
		case OpenDescriptionEditPart.VISUAL_ID:
			return getOpenDescription_5074Parser();
		case FetchDescriptionEditPart.VISUAL_ID:
			return getFetchDescription_5075Parser();
		case CloseDescriptionEditPart.VISUAL_ID:
			return getCloseDescription_5076Parser();
		case CallProcedureDescriptionEditPart.VISUAL_ID:
			return getCallProcedureDescription_5077Parser();
		case CallFunctionDescriptionEditPart.VISUAL_ID:
			return getCallFunctionDescription_5078Parser();
		case DataTypeName3EditPart.VISUAL_ID:
			return getDataTypeName_5023Parser();
		case CollectionsName3EditPart.VISUAL_ID:
			return getCollectionsName_5024Parser();
		case RecordsName3EditPart.VISUAL_ID:
			return getRecordsName_5025Parser();
		case CursorName3EditPart.VISUAL_ID:
			return getCursorName_5026Parser();
		case DataTypeName4EditPart.VISUAL_ID:
			return getDataTypeName_5027Parser();
		case CollectionsName4EditPart.VISUAL_ID:
			return getCollectionsName_5028Parser();
		case RecordsName4EditPart.VISUAL_ID:
			return getRecordsName_5029Parser();
		case CursorName4EditPart.VISUAL_ID:
			return getCursorName_5030Parser();
		case DataTypeName5EditPart.VISUAL_ID:
			return getDataTypeName_5079Parser();
		case CollectionsName5EditPart.VISUAL_ID:
			return getCollectionsName_5080Parser();
		case RecordsName5EditPart.VISUAL_ID:
			return getRecordsName_5081Parser();
		case CursorName5EditPart.VISUAL_ID:
			return getCursorName_5082Parser();
		case ExceptionDescription2EditPart.VISUAL_ID:
			return getExceptionDescription_5083Parser();
		case IfDescription2EditPart.VISUAL_ID:
			return getIfDescription_5084Parser();
		case CaseDescription2EditPart.VISUAL_ID:
			return getCaseDescription_5085Parser();
		case InsertDescription2EditPart.VISUAL_ID:
			return getInsertDescription_5086Parser();
		case UpdateDescription2EditPart.VISUAL_ID:
			return getUpdateDescription_5087Parser();
		case DeleteDescription2EditPart.VISUAL_ID:
			return getDeleteDescription_5088Parser();
		case SelectDescription2EditPart.VISUAL_ID:
			return getSelectDescription_5089Parser();
		case WhileDescription2EditPart.VISUAL_ID:
			return getWhileDescription_5090Parser();
		case ForDescription2EditPart.VISUAL_ID:
			return getForDescription_5091Parser();
		case LoopDescription2EditPart.VISUAL_ID:
			return getLoopDescription_5092Parser();
		case OpenDescription2EditPart.VISUAL_ID:
			return getOpenDescription_5093Parser();
		case FetchDescription2EditPart.VISUAL_ID:
			return getFetchDescription_5094Parser();
		case CloseDescription2EditPart.VISUAL_ID:
			return getCloseDescription_5095Parser();
		case CallProcedureDescription2EditPart.VISUAL_ID:
			return getCallProcedureDescription_5096Parser();
		case CallFunctionDescription2EditPart.VISUAL_ID:
			return getCallFunctionDescription_5097Parser();
		case DataTypeName6EditPart.VISUAL_ID:
			return getDataTypeName_5037Parser();
		case CollectionsName6EditPart.VISUAL_ID:
			return getCollectionsName_5038Parser();
		case RecordsName6EditPart.VISUAL_ID:
			return getRecordsName_5039Parser();
		case CursorName6EditPart.VISUAL_ID:
			return getCursorName_5040Parser();
		case ExceptionDescription3EditPart.VISUAL_ID:
			return getExceptionDescription_5041Parser();
		case IfDescription3EditPart.VISUAL_ID:
			return getIfDescription_5042Parser();
		case CaseDescription3EditPart.VISUAL_ID:
			return getCaseDescription_5043Parser();
		case InsertDescription3EditPart.VISUAL_ID:
			return getInsertDescription_5044Parser();
		case UpdateDescription3EditPart.VISUAL_ID:
			return getUpdateDescription_5045Parser();
		case DeleteDescription3EditPart.VISUAL_ID:
			return getDeleteDescription_5046Parser();
		case SelectDescription3EditPart.VISUAL_ID:
			return getSelectDescription_5047Parser();
		case WhileDescription3EditPart.VISUAL_ID:
			return getWhileDescription_5048Parser();
		case ForDescription3EditPart.VISUAL_ID:
			return getForDescription_5049Parser();
		case LoopDescription3EditPart.VISUAL_ID:
			return getLoopDescription_5050Parser();
		case OpenDescription3EditPart.VISUAL_ID:
			return getOpenDescription_5051Parser();
		case FetchDescription3EditPart.VISUAL_ID:
			return getFetchDescription_5052Parser();
		case CloseDescription3EditPart.VISUAL_ID:
			return getCloseDescription_5053Parser();
		case CallProcedureDescription3EditPart.VISUAL_ID:
			return getCallProcedureDescription_5054Parser();
		case CallFunctionDescription3EditPart.VISUAL_ID:
			return getCallFunctionDescription_5055Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(CrystalVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(CrystalVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (CrystalElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
