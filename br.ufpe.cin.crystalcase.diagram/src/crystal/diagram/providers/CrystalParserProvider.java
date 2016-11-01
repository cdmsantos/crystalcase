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
import crystal.diagram.edit.parts.*;
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
import crystal.diagram.edit.parts.CollectionsNameName2EditPart;
import crystal.diagram.edit.parts.CollectionsNameName3EditPart;
import crystal.diagram.edit.parts.CollectionsNameName4EditPart;
import crystal.diagram.edit.parts.CollectionsNameName5EditPart;
import crystal.diagram.edit.parts.CollectionsNameName6EditPart;
import crystal.diagram.edit.parts.CollectionsNameNameEditPart;
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
import crystal.diagram.edit.parts.RecordsNameName2EditPart;
import crystal.diagram.edit.parts.RecordsNameName3EditPart;
import crystal.diagram.edit.parts.RecordsNameName4EditPart;
import crystal.diagram.edit.parts.RecordsNameName5EditPart;
import crystal.diagram.edit.parts.RecordsNameName6EditPart;
import crystal.diagram.edit.parts.RecordsNameNameEditPart;
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
	private IParser exceptionDescription_5189Parser;

	/**
	* @generated
	*/
	private IParser getExceptionDescription_5189Parser() {
		if (exceptionDescription_5189Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exceptionDescription_5189Parser = parser;
		}
		return exceptionDescription_5189Parser;
	}

	/**
	* @generated
	*/
	private IParser ifDescription_5218Parser;

	/**
	* @generated
	*/
	private IParser getIfDescription_5218Parser() {
		if (ifDescription_5218Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifDescription_5218Parser = parser;
		}
		return ifDescription_5218Parser;
	}

	/**
	* @generated
	*/
	private IParser caseDescription_5217Parser;

	/**
	* @generated
	*/
	private IParser getCaseDescription_5217Parser() {
		if (caseDescription_5217Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caseDescription_5217Parser = parser;
		}
		return caseDescription_5217Parser;
	}

	/**
	* @generated
	*/
	private IParser selectorDescription_5156Parser;

	/**
	* @generated
	*/
	private IParser getSelectorDescription_5156Parser() {
		if (selectorDescription_5156Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getSelector_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectorDescription_5156Parser = parser;
		}
		return selectorDescription_5156Parser;
	}

	/**
	* @generated
	*/
	private IParser exceptionDescription_5114Parser;

	/**
	* @generated
	*/
	private IParser getExceptionDescription_5114Parser() {
		if (exceptionDescription_5114Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exceptionDescription_5114Parser = parser;
		}
		return exceptionDescription_5114Parser;
	}

	/**
	* @generated
	*/
	private IParser ifDescription_5142Parser;

	/**
	* @generated
	*/
	private IParser getIfDescription_5142Parser() {
		if (ifDescription_5142Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifDescription_5142Parser = parser;
		}
		return ifDescription_5142Parser;
	}

	/**
	* @generated
	*/
	private IParser insertDescription_5190Parser;

	/**
	* @generated
	*/
	private IParser getInsertDescription_5190Parser() {
		if (insertDescription_5190Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			insertDescription_5190Parser = parser;
		}
		return insertDescription_5190Parser;
	}

	/**
	* @generated
	*/
	private IParser updateDescription_5191Parser;

	/**
	* @generated
	*/
	private IParser getUpdateDescription_5191Parser() {
		if (updateDescription_5191Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateDescription_5191Parser = parser;
		}
		return updateDescription_5191Parser;
	}

	/**
	* @generated
	*/
	private IParser deleteDescription_5192Parser;

	/**
	* @generated
	*/
	private IParser getDeleteDescription_5192Parser() {
		if (deleteDescription_5192Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteDescription_5192Parser = parser;
		}
		return deleteDescription_5192Parser;
	}

	/**
	* @generated
	*/
	private IParser selectDescription_5193Parser;

	/**
	* @generated
	*/
	private IParser getSelectDescription_5193Parser() {
		if (selectDescription_5193Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectDescription_5193Parser = parser;
		}
		return selectDescription_5193Parser;
	}

	/**
	* @generated
	*/
	private IParser whileDescription_5216Parser;

	/**
	* @generated
	*/
	private IParser getWhileDescription_5216Parser() {
		if (whileDescription_5216Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			whileDescription_5216Parser = parser;
		}
		return whileDescription_5216Parser;
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
	private IParser exceptionDescription_5098Parser;

	/**
	* @generated
	*/
	private IParser getExceptionDescription_5098Parser() {
		if (exceptionDescription_5098Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exceptionDescription_5098Parser = parser;
		}
		return exceptionDescription_5098Parser;
	}

	/**
	* @generated
	*/
	private IParser ifDescription_5099Parser;

	/**
	* @generated
	*/
	private IParser getIfDescription_5099Parser() {
		if (ifDescription_5099Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifDescription_5099Parser = parser;
		}
		return ifDescription_5099Parser;
	}

	/**
	* @generated
	*/
	private IParser forDescription_5215Parser;

	/**
	* @generated
	*/
	private IParser getForDescription_5215Parser() {
		if (forDescription_5215Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			forDescription_5215Parser = parser;
		}
		return forDescription_5215Parser;
	}

	/**
	* @generated
	*/
	private IParser exceptionDescription_5159Parser;

	/**
	* @generated
	*/
	private IParser getExceptionDescription_5159Parser() {
		if (exceptionDescription_5159Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exceptionDescription_5159Parser = parser;
		}
		return exceptionDescription_5159Parser;
	}

	/**
	* @generated
	*/
	private IParser ifDescription_5188Parser;

	/**
	* @generated
	*/
	private IParser getIfDescription_5188Parser() {
		if (ifDescription_5188Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifDescription_5188Parser = parser;
		}
		return ifDescription_5188Parser;
	}

	/**
	* @generated
	*/
	private IParser loopDescription_5214Parser;

	/**
	* @generated
	*/
	private IParser getLoopDescription_5214Parser() {
		if (loopDescription_5214Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loopDescription_5214Parser = parser;
		}
		return loopDescription_5214Parser;
	}

	/**
	* @generated
	*/
	private IParser exceptionDescription_5160Parser;

	/**
	* @generated
	*/
	private IParser getExceptionDescription_5160Parser() {
		if (exceptionDescription_5160Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exceptionDescription_5160Parser = parser;
		}
		return exceptionDescription_5160Parser;
	}

	/**
	* @generated
	*/
	private IParser ifDescription_5187Parser;

	/**
	* @generated
	*/
	private IParser getIfDescription_5187Parser() {
		if (ifDescription_5187Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifDescription_5187Parser = parser;
		}
		return ifDescription_5187Parser;
	}

	/**
	* @generated
	*/
	private IParser openDescription_5194Parser;

	/**
	* @generated
	*/
	private IParser getOpenDescription_5194Parser() {
		if (openDescription_5194Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			openDescription_5194Parser = parser;
		}
		return openDescription_5194Parser;
	}

	/**
	* @generated
	*/
	private IParser fetchDescription_5195Parser;

	/**
	* @generated
	*/
	private IParser getFetchDescription_5195Parser() {
		if (fetchDescription_5195Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fetchDescription_5195Parser = parser;
		}
		return fetchDescription_5195Parser;
	}

	/**
	* @generated
	*/
	private IParser closeDescription_5196Parser;

	/**
	* @generated
	*/
	private IParser getCloseDescription_5196Parser() {
		if (closeDescription_5196Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			closeDescription_5196Parser = parser;
		}
		return closeDescription_5196Parser;
	}

	/**
	* @generated
	*/
	private IParser callProcedureDescription_5197Parser;

	/**
	* @generated
	*/
	private IParser getCallProcedureDescription_5197Parser() {
		if (callProcedureDescription_5197Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callProcedureDescription_5197Parser = parser;
		}
		return callProcedureDescription_5197Parser;
	}

	/**
	* @generated
	*/
	private IParser callFunctionDescription_5198Parser;

	/**
	* @generated
	*/
	private IParser getCallFunctionDescription_5198Parser() {
		if (callFunctionDescription_5198Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callFunctionDescription_5198Parser = parser;
		}
		return callFunctionDescription_5198Parser;
	}

	/**
	* @generated
	*/
	private IParser expressionDescription_5219Parser;

	/**
	* @generated
	*/
	private IParser getExpressionDescription_5219Parser() {
		if (expressionDescription_5219Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			expressionDescription_5219Parser = parser;
		}
		return expressionDescription_5219Parser;
	}

	/**
	* @generated
	*/
	private IParser exceptionDescription_5199Parser;

	/**
	* @generated
	*/
	private IParser getExceptionDescription_5199Parser() {
		if (exceptionDescription_5199Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exceptionDescription_5199Parser = parser;
		}
		return exceptionDescription_5199Parser;
	}

	/**
	* @generated
	*/
	private IParser ifDescription_5213Parser;

	/**
	* @generated
	*/
	private IParser getIfDescription_5213Parser() {
		if (ifDescription_5213Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifDescription_5213Parser = parser;
		}
		return ifDescription_5213Parser;
	}

	/**
	* @generated
	*/
	private IParser caseDescription_5200Parser;

	/**
	* @generated
	*/
	private IParser getCaseDescription_5200Parser() {
		if (caseDescription_5200Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caseDescription_5200Parser = parser;
		}
		return caseDescription_5200Parser;
	}

	/**
	* @generated
	*/
	private IParser insertDescription_5201Parser;

	/**
	* @generated
	*/
	private IParser getInsertDescription_5201Parser() {
		if (insertDescription_5201Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			insertDescription_5201Parser = parser;
		}
		return insertDescription_5201Parser;
	}

	/**
	* @generated
	*/
	private IParser updateDescription_5202Parser;

	/**
	* @generated
	*/
	private IParser getUpdateDescription_5202Parser() {
		if (updateDescription_5202Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateDescription_5202Parser = parser;
		}
		return updateDescription_5202Parser;
	}

	/**
	* @generated
	*/
	private IParser deleteDescription_5203Parser;

	/**
	* @generated
	*/
	private IParser getDeleteDescription_5203Parser() {
		if (deleteDescription_5203Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteDescription_5203Parser = parser;
		}
		return deleteDescription_5203Parser;
	}

	/**
	* @generated
	*/
	private IParser selectDescription_5204Parser;

	/**
	* @generated
	*/
	private IParser getSelectDescription_5204Parser() {
		if (selectDescription_5204Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectDescription_5204Parser = parser;
		}
		return selectDescription_5204Parser;
	}

	/**
	* @generated
	*/
	private IParser whileDescription_5205Parser;

	/**
	* @generated
	*/
	private IParser getWhileDescription_5205Parser() {
		if (whileDescription_5205Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			whileDescription_5205Parser = parser;
		}
		return whileDescription_5205Parser;
	}

	/**
	* @generated
	*/
	private IParser caseDescription_5100Parser;

	/**
	* @generated
	*/
	private IParser getCaseDescription_5100Parser() {
		if (caseDescription_5100Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caseDescription_5100Parser = parser;
		}
		return caseDescription_5100Parser;
	}

	/**
	* @generated
	*/
	private IParser insertDescription_5101Parser;

	/**
	* @generated
	*/
	private IParser getInsertDescription_5101Parser() {
		if (insertDescription_5101Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			insertDescription_5101Parser = parser;
		}
		return insertDescription_5101Parser;
	}

	/**
	* @generated
	*/
	private IParser updateDescription_5102Parser;

	/**
	* @generated
	*/
	private IParser getUpdateDescription_5102Parser() {
		if (updateDescription_5102Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateDescription_5102Parser = parser;
		}
		return updateDescription_5102Parser;
	}

	/**
	* @generated
	*/
	private IParser deleteDescription_5103Parser;

	/**
	* @generated
	*/
	private IParser getDeleteDescription_5103Parser() {
		if (deleteDescription_5103Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteDescription_5103Parser = parser;
		}
		return deleteDescription_5103Parser;
	}

	/**
	* @generated
	*/
	private IParser selectDescription_5104Parser;

	/**
	* @generated
	*/
	private IParser getSelectDescription_5104Parser() {
		if (selectDescription_5104Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectDescription_5104Parser = parser;
		}
		return selectDescription_5104Parser;
	}

	/**
	* @generated
	*/
	private IParser whileDescription_5112Parser;

	/**
	* @generated
	*/
	private IParser getWhileDescription_5112Parser() {
		if (whileDescription_5112Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			whileDescription_5112Parser = parser;
		}
		return whileDescription_5112Parser;
	}

	/**
	* @generated
	*/
	private IParser forDescription_5105Parser;

	/**
	* @generated
	*/
	private IParser getForDescription_5105Parser() {
		if (forDescription_5105Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			forDescription_5105Parser = parser;
		}
		return forDescription_5105Parser;
	}

	/**
	* @generated
	*/
	private IParser caseDescription_5161Parser;

	/**
	* @generated
	*/
	private IParser getCaseDescription_5161Parser() {
		if (caseDescription_5161Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caseDescription_5161Parser = parser;
		}
		return caseDescription_5161Parser;
	}

	/**
	* @generated
	*/
	private IParser insertDescription_5162Parser;

	/**
	* @generated
	*/
	private IParser getInsertDescription_5162Parser() {
		if (insertDescription_5162Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			insertDescription_5162Parser = parser;
		}
		return insertDescription_5162Parser;
	}

	/**
	* @generated
	*/
	private IParser updateDescription_5163Parser;

	/**
	* @generated
	*/
	private IParser getUpdateDescription_5163Parser() {
		if (updateDescription_5163Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateDescription_5163Parser = parser;
		}
		return updateDescription_5163Parser;
	}

	/**
	* @generated
	*/
	private IParser deleteDescription_5164Parser;

	/**
	* @generated
	*/
	private IParser getDeleteDescription_5164Parser() {
		if (deleteDescription_5164Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteDescription_5164Parser = parser;
		}
		return deleteDescription_5164Parser;
	}

	/**
	* @generated
	*/
	private IParser selectDescription_5165Parser;

	/**
	* @generated
	*/
	private IParser getSelectDescription_5165Parser() {
		if (selectDescription_5165Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectDescription_5165Parser = parser;
		}
		return selectDescription_5165Parser;
	}

	/**
	* @generated
	*/
	private IParser whileDescription_5186Parser;

	/**
	* @generated
	*/
	private IParser getWhileDescription_5186Parser() {
		if (whileDescription_5186Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			whileDescription_5186Parser = parser;
		}
		return whileDescription_5186Parser;
	}

	/**
	* @generated
	*/
	private IParser loopDescription_5106Parser;

	/**
	* @generated
	*/
	private IParser getLoopDescription_5106Parser() {
		if (loopDescription_5106Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loopDescription_5106Parser = parser;
		}
		return loopDescription_5106Parser;
	}

	/**
	* @generated
	*/
	private IParser caseDescription_5166Parser;

	/**
	* @generated
	*/
	private IParser getCaseDescription_5166Parser() {
		if (caseDescription_5166Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caseDescription_5166Parser = parser;
		}
		return caseDescription_5166Parser;
	}

	/**
	* @generated
	*/
	private IParser insertDescription_5167Parser;

	/**
	* @generated
	*/
	private IParser getInsertDescription_5167Parser() {
		if (insertDescription_5167Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			insertDescription_5167Parser = parser;
		}
		return insertDescription_5167Parser;
	}

	/**
	* @generated
	*/
	private IParser updateDescription_5168Parser;

	/**
	* @generated
	*/
	private IParser getUpdateDescription_5168Parser() {
		if (updateDescription_5168Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateDescription_5168Parser = parser;
		}
		return updateDescription_5168Parser;
	}

	/**
	* @generated
	*/
	private IParser deleteDescription_5169Parser;

	/**
	* @generated
	*/
	private IParser getDeleteDescription_5169Parser() {
		if (deleteDescription_5169Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteDescription_5169Parser = parser;
		}
		return deleteDescription_5169Parser;
	}

	/**
	* @generated
	*/
	private IParser selectDescription_5170Parser;

	/**
	* @generated
	*/
	private IParser getSelectDescription_5170Parser() {
		if (selectDescription_5170Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectDescription_5170Parser = parser;
		}
		return selectDescription_5170Parser;
	}

	/**
	* @generated
	*/
	private IParser whileDescription_5171Parser;

	/**
	* @generated
	*/
	private IParser getWhileDescription_5171Parser() {
		if (whileDescription_5171Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			whileDescription_5171Parser = parser;
		}
		return whileDescription_5171Parser;
	}

	/**
	* @generated
	*/
	private IParser openDescription_5107Parser;

	/**
	* @generated
	*/
	private IParser getOpenDescription_5107Parser() {
		if (openDescription_5107Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			openDescription_5107Parser = parser;
		}
		return openDescription_5107Parser;
	}

	/**
	* @generated
	*/
	private IParser fetchDescription_5108Parser;

	/**
	* @generated
	*/
	private IParser getFetchDescription_5108Parser() {
		if (fetchDescription_5108Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fetchDescription_5108Parser = parser;
		}
		return fetchDescription_5108Parser;
	}

	/**
	* @generated
	*/
	private IParser closeDescription_5109Parser;

	/**
	* @generated
	*/
	private IParser getCloseDescription_5109Parser() {
		if (closeDescription_5109Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			closeDescription_5109Parser = parser;
		}
		return closeDescription_5109Parser;
	}

	/**
	* @generated
	*/
	private IParser callProcedureDescription_5110Parser;

	/**
	* @generated
	*/
	private IParser getCallProcedureDescription_5110Parser() {
		if (callProcedureDescription_5110Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callProcedureDescription_5110Parser = parser;
		}
		return callProcedureDescription_5110Parser;
	}

	/**
	* @generated
	*/
	private IParser callFunctionDescription_5111Parser;

	/**
	* @generated
	*/
	private IParser getCallFunctionDescription_5111Parser() {
		if (callFunctionDescription_5111Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callFunctionDescription_5111Parser = parser;
		}
		return callFunctionDescription_5111Parser;
	}

	/**
	* @generated
	*/
	private IParser expressionDescription_5220Parser;

	/**
	* @generated
	*/
	private IParser getExpressionDescription_5220Parser() {
		if (expressionDescription_5220Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			expressionDescription_5220Parser = parser;
		}
		return expressionDescription_5220Parser;
	}

	/**
	* @generated
	*/
	private IParser forDescription_5185Parser;

	/**
	* @generated
	*/
	private IParser getForDescription_5185Parser() {
		if (forDescription_5185Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			forDescription_5185Parser = parser;
		}
		return forDescription_5185Parser;
	}

	/**
	* @generated
	*/
	private IParser forDescription_5184Parser;

	/**
	* @generated
	*/
	private IParser getForDescription_5184Parser() {
		if (forDescription_5184Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			forDescription_5184Parser = parser;
		}
		return forDescription_5184Parser;
	}

	/**
	* @generated
	*/
	private IParser loopDescription_5178Parser;

	/**
	* @generated
	*/
	private IParser getLoopDescription_5178Parser() {
		if (loopDescription_5178Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loopDescription_5178Parser = parser;
		}
		return loopDescription_5178Parser;
	}

	/**
	* @generated
	*/
	private IParser loopDescription_5177Parser;

	/**
	* @generated
	*/
	private IParser getLoopDescription_5177Parser() {
		if (loopDescription_5177Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loopDescription_5177Parser = parser;
		}
		return loopDescription_5177Parser;
	}

	/**
	* @generated
	*/
	private IParser openDescription_5172Parser;

	/**
	* @generated
	*/
	private IParser getOpenDescription_5172Parser() {
		if (openDescription_5172Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			openDescription_5172Parser = parser;
		}
		return openDescription_5172Parser;
	}

	/**
	* @generated
	*/
	private IParser fetchDescription_5173Parser;

	/**
	* @generated
	*/
	private IParser getFetchDescription_5173Parser() {
		if (fetchDescription_5173Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fetchDescription_5173Parser = parser;
		}
		return fetchDescription_5173Parser;
	}

	/**
	* @generated
	*/
	private IParser closeDescription_5174Parser;

	/**
	* @generated
	*/
	private IParser getCloseDescription_5174Parser() {
		if (closeDescription_5174Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			closeDescription_5174Parser = parser;
		}
		return closeDescription_5174Parser;
	}

	/**
	* @generated
	*/
	private IParser callProcedureDescription_5175Parser;

	/**
	* @generated
	*/
	private IParser getCallProcedureDescription_5175Parser() {
		if (callProcedureDescription_5175Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callProcedureDescription_5175Parser = parser;
		}
		return callProcedureDescription_5175Parser;
	}

	/**
	* @generated
	*/
	private IParser callFunctionDescription_5176Parser;

	/**
	* @generated
	*/
	private IParser getCallFunctionDescription_5176Parser() {
		if (callFunctionDescription_5176Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callFunctionDescription_5176Parser = parser;
		}
		return callFunctionDescription_5176Parser;
	}

	/**
	* @generated
	*/
	private IParser expressionDescription_5221Parser;

	/**
	* @generated
	*/
	private IParser getExpressionDescription_5221Parser() {
		if (expressionDescription_5221Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			expressionDescription_5221Parser = parser;
		}
		return expressionDescription_5221Parser;
	}

	/**
	* @generated
	*/
	private IParser openDescription_5179Parser;

	/**
	* @generated
	*/
	private IParser getOpenDescription_5179Parser() {
		if (openDescription_5179Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			openDescription_5179Parser = parser;
		}
		return openDescription_5179Parser;
	}

	/**
	* @generated
	*/
	private IParser fetchDescription_5180Parser;

	/**
	* @generated
	*/
	private IParser getFetchDescription_5180Parser() {
		if (fetchDescription_5180Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fetchDescription_5180Parser = parser;
		}
		return fetchDescription_5180Parser;
	}

	/**
	* @generated
	*/
	private IParser closeDescription_5181Parser;

	/**
	* @generated
	*/
	private IParser getCloseDescription_5181Parser() {
		if (closeDescription_5181Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			closeDescription_5181Parser = parser;
		}
		return closeDescription_5181Parser;
	}

	/**
	* @generated
	*/
	private IParser callProcedureDescription_5182Parser;

	/**
	* @generated
	*/
	private IParser getCallProcedureDescription_5182Parser() {
		if (callProcedureDescription_5182Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callProcedureDescription_5182Parser = parser;
		}
		return callProcedureDescription_5182Parser;
	}

	/**
	* @generated
	*/
	private IParser callFunctionDescription_5183Parser;

	/**
	* @generated
	*/
	private IParser getCallFunctionDescription_5183Parser() {
		if (callFunctionDescription_5183Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callFunctionDescription_5183Parser = parser;
		}
		return callFunctionDescription_5183Parser;
	}

	/**
	* @generated
	*/
	private IParser expressionDescription_5222Parser;

	/**
	* @generated
	*/
	private IParser getExpressionDescription_5222Parser() {
		if (expressionDescription_5222Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			expressionDescription_5222Parser = parser;
		}
		return expressionDescription_5222Parser;
	}

	/**
	* @generated
	*/
	private IParser forDescription_5206Parser;

	/**
	* @generated
	*/
	private IParser getForDescription_5206Parser() {
		if (forDescription_5206Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			forDescription_5206Parser = parser;
		}
		return forDescription_5206Parser;
	}

	/**
	* @generated
	*/
	private IParser loopDescription_5207Parser;

	/**
	* @generated
	*/
	private IParser getLoopDescription_5207Parser() {
		if (loopDescription_5207Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loopDescription_5207Parser = parser;
		}
		return loopDescription_5207Parser;
	}

	/**
	* @generated
	*/
	private IParser openDescription_5208Parser;

	/**
	* @generated
	*/
	private IParser getOpenDescription_5208Parser() {
		if (openDescription_5208Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			openDescription_5208Parser = parser;
		}
		return openDescription_5208Parser;
	}

	/**
	* @generated
	*/
	private IParser fetchDescription_5209Parser;

	/**
	* @generated
	*/
	private IParser getFetchDescription_5209Parser() {
		if (fetchDescription_5209Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fetchDescription_5209Parser = parser;
		}
		return fetchDescription_5209Parser;
	}

	/**
	* @generated
	*/
	private IParser closeDescription_5210Parser;

	/**
	* @generated
	*/
	private IParser getCloseDescription_5210Parser() {
		if (closeDescription_5210Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			closeDescription_5210Parser = parser;
		}
		return closeDescription_5210Parser;
	}

	/**
	* @generated
	*/
	private IParser callProcedureDescription_5211Parser;

	/**
	* @generated
	*/
	private IParser getCallProcedureDescription_5211Parser() {
		if (callProcedureDescription_5211Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callProcedureDescription_5211Parser = parser;
		}
		return callProcedureDescription_5211Parser;
	}

	/**
	* @generated
	*/
	private IParser callFunctionDescription_5212Parser;

	/**
	* @generated
	*/
	private IParser getCallFunctionDescription_5212Parser() {
		if (callFunctionDescription_5212Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callFunctionDescription_5212Parser = parser;
		}
		return callFunctionDescription_5212Parser;
	}

	/**
	* @generated
	*/
	private IParser expressionDescription_5223Parser;

	/**
	* @generated
	*/
	private IParser getExpressionDescription_5223Parser() {
		if (expressionDescription_5223Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			expressionDescription_5223Parser = parser;
		}
		return expressionDescription_5223Parser;
	}

	/**
	* @generated
	*/
	private IParser caseDescription_5143Parser;

	/**
	* @generated
	*/
	private IParser getCaseDescription_5143Parser() {
		if (caseDescription_5143Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caseDescription_5143Parser = parser;
		}
		return caseDescription_5143Parser;
	}

	/**
	* @generated
	*/
	private IParser insertDescription_5144Parser;

	/**
	* @generated
	*/
	private IParser getInsertDescription_5144Parser() {
		if (insertDescription_5144Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			insertDescription_5144Parser = parser;
		}
		return insertDescription_5144Parser;
	}

	/**
	* @generated
	*/
	private IParser updateDescription_5145Parser;

	/**
	* @generated
	*/
	private IParser getUpdateDescription_5145Parser() {
		if (updateDescription_5145Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateDescription_5145Parser = parser;
		}
		return updateDescription_5145Parser;
	}

	/**
	* @generated
	*/
	private IParser deleteDescription_5146Parser;

	/**
	* @generated
	*/
	private IParser getDeleteDescription_5146Parser() {
		if (deleteDescription_5146Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteDescription_5146Parser = parser;
		}
		return deleteDescription_5146Parser;
	}

	/**
	* @generated
	*/
	private IParser selectDescription_5147Parser;

	/**
	* @generated
	*/
	private IParser getSelectDescription_5147Parser() {
		if (selectDescription_5147Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectDescription_5147Parser = parser;
		}
		return selectDescription_5147Parser;
	}

	/**
	* @generated
	*/
	private IParser whileDescription_5148Parser;

	/**
	* @generated
	*/
	private IParser getWhileDescription_5148Parser() {
		if (whileDescription_5148Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			whileDescription_5148Parser = parser;
		}
		return whileDescription_5148Parser;
	}

	/**
	* @generated
	*/
	private IParser forDescription_5149Parser;

	/**
	* @generated
	*/
	private IParser getForDescription_5149Parser() {
		if (forDescription_5149Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			forDescription_5149Parser = parser;
		}
		return forDescription_5149Parser;
	}

	/**
	* @generated
	*/
	private IParser loopDescription_5150Parser;

	/**
	* @generated
	*/
	private IParser getLoopDescription_5150Parser() {
		if (loopDescription_5150Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loopDescription_5150Parser = parser;
		}
		return loopDescription_5150Parser;
	}

	/**
	* @generated
	*/
	private IParser openDescription_5151Parser;

	/**
	* @generated
	*/
	private IParser getOpenDescription_5151Parser() {
		if (openDescription_5151Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			openDescription_5151Parser = parser;
		}
		return openDescription_5151Parser;
	}

	/**
	* @generated
	*/
	private IParser fetchDescription_5152Parser;

	/**
	* @generated
	*/
	private IParser getFetchDescription_5152Parser() {
		if (fetchDescription_5152Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fetchDescription_5152Parser = parser;
		}
		return fetchDescription_5152Parser;
	}

	/**
	* @generated
	*/
	private IParser closeDescription_5153Parser;

	/**
	* @generated
	*/
	private IParser getCloseDescription_5153Parser() {
		if (closeDescription_5153Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			closeDescription_5153Parser = parser;
		}
		return closeDescription_5153Parser;
	}

	/**
	* @generated
	*/
	private IParser callProcedureDescription_5154Parser;

	/**
	* @generated
	*/
	private IParser getCallProcedureDescription_5154Parser() {
		if (callProcedureDescription_5154Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callProcedureDescription_5154Parser = parser;
		}
		return callProcedureDescription_5154Parser;
	}

	/**
	* @generated
	*/
	private IParser callFunctionDescription_5155Parser;

	/**
	* @generated
	*/
	private IParser getCallFunctionDescription_5155Parser() {
		if (callFunctionDescription_5155Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callFunctionDescription_5155Parser = parser;
		}
		return callFunctionDescription_5155Parser;
	}

	/**
	* @generated
	*/
	private IParser expressionDescription_5224Parser;

	/**
	* @generated
	*/
	private IParser getExpressionDescription_5224Parser() {
		if (expressionDescription_5224Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			expressionDescription_5224Parser = parser;
		}
		return expressionDescription_5224Parser;
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
	private IParser expressionDescription_5225Parser;

	/**
	* @generated
	*/
	private IParser getExpressionDescription_5225Parser() {
		if (expressionDescription_5225Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			expressionDescription_5225Parser = parser;
		}
		return expressionDescription_5225Parser;
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
	private IParser expressionDescription_5226Parser;

	/**
	* @generated
	*/
	private IParser getExpressionDescription_5226Parser() {
		if (expressionDescription_5226Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			expressionDescription_5226Parser = parser;
		}
		return expressionDescription_5226Parser;
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
	private IParser expressionDescription_5227Parser;

	/**
	* @generated
	*/
	private IParser getExpressionDescription_5227Parser() {
		if (expressionDescription_5227Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getStatements_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			expressionDescription_5227Parser = parser;
		}
		return expressionDescription_5227Parser;
	}

	/**
	* @generated
	*/
	private IParser transitionName_6001Parser;

	/**
	* @generated
	*/
	private IParser getTransitionName_6001Parser() {
		if (transitionName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getTransition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			transitionName_6001Parser = parser;
		}
		return transitionName_6001Parser;
	}

	/**
	* @generated
	*/
	private IParser selectorTransitionName_6002Parser;

	/**
	* @generated
	*/
	private IParser getSelectorTransitionName_6002Parser() {
		if (selectorTransitionName_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { CrystalPackage.eINSTANCE.getSelectorTransition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectorTransitionName_6002Parser = parser;
		}
		return selectorTransitionName_6002Parser;
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
			return getDataTypeName_5060Parser();
		case CollectionsNameEditPart.VISUAL_ID:
			return getCollectionsName_5061Parser();
		case RecordsNameEditPart.VISUAL_ID:
			return getRecordsName_5062Parser();
		case CursorNameEditPart.VISUAL_ID:
			return getCursorName_5063Parser();
		case DataTypeName2EditPart.VISUAL_ID:
			return getDataTypeName_5018Parser();
		case CollectionsName2EditPart.VISUAL_ID:
			return getCollectionsName_5019Parser();
		case RecordsName2EditPart.VISUAL_ID:
			return getRecordsName_5020Parser();
		case CursorName2EditPart.VISUAL_ID:
			return getCursorName_5021Parser();
		case ExceptionDescriptionEditPart.VISUAL_ID:
			return getExceptionDescription_5064Parser();
		case IfDescriptionEditPart.VISUAL_ID:
			return getIfDescription_5065Parser();
		case ExceptionDescription2EditPart.VISUAL_ID:
			return getExceptionDescription_5189Parser();
		case IfDescription2EditPart.VISUAL_ID:
			return getIfDescription_5218Parser();
		case CaseDescriptionEditPart.VISUAL_ID:
			return getCaseDescription_5217Parser();
		case SelectorDescriptionEditPart.VISUAL_ID:
			return getSelectorDescription_5156Parser();
		case ExceptionDescription3EditPart.VISUAL_ID:
			return getExceptionDescription_5114Parser();
		case IfDescription3EditPart.VISUAL_ID:
			return getIfDescription_5142Parser();
		case InsertDescriptionEditPart.VISUAL_ID:
			return getInsertDescription_5190Parser();
		case UpdateDescriptionEditPart.VISUAL_ID:
			return getUpdateDescription_5191Parser();
		case DeleteDescriptionEditPart.VISUAL_ID:
			return getDeleteDescription_5192Parser();
		case SelectDescriptionEditPart.VISUAL_ID:
			return getSelectDescription_5193Parser();
		case WhileDescriptionEditPart.VISUAL_ID:
			return getWhileDescription_5216Parser();
		case ExceptionDescription4EditPart.VISUAL_ID:
			return getExceptionDescription_5098Parser();
		case IfDescription4EditPart.VISUAL_ID:
			return getIfDescription_5099Parser();
		case ForDescriptionEditPart.VISUAL_ID:
			return getForDescription_5215Parser();
		case ExceptionDescription5EditPart.VISUAL_ID:
			return getExceptionDescription_5159Parser();
		case IfDescription5EditPart.VISUAL_ID:
			return getIfDescription_5188Parser();
		case LoopDescriptionEditPart.VISUAL_ID:
			return getLoopDescription_5214Parser();
		case ExceptionDescription6EditPart.VISUAL_ID:
			return getExceptionDescription_5160Parser();
		case IfDescription6EditPart.VISUAL_ID:
			return getIfDescription_5187Parser();
		case OpenDescriptionEditPart.VISUAL_ID:
			return getOpenDescription_5194Parser();
		case FetchDescriptionEditPart.VISUAL_ID:
			return getFetchDescription_5195Parser();
		case CloseDescriptionEditPart.VISUAL_ID:
			return getCloseDescription_5196Parser();
		case CallProcedureDescriptionEditPart.VISUAL_ID:
			return getCallProcedureDescription_5197Parser();
		case CallFunctionDescriptionEditPart.VISUAL_ID:
			return getCallFunctionDescription_5198Parser();
		case ExpressionDescriptionEditPart.VISUAL_ID:
			return getExpressionDescription_5219Parser();
		case ExceptionDescription7EditPart.VISUAL_ID:
			return getExceptionDescription_5199Parser();
		case IfDescription7EditPart.VISUAL_ID:
			return getIfDescription_5213Parser();
		case CaseDescription2EditPart.VISUAL_ID:
			return getCaseDescription_5200Parser();
		case InsertDescription2EditPart.VISUAL_ID:
			return getInsertDescription_5201Parser();
		case UpdateDescription2EditPart.VISUAL_ID:
			return getUpdateDescription_5202Parser();
		case DeleteDescription2EditPart.VISUAL_ID:
			return getDeleteDescription_5203Parser();
		case SelectDescription2EditPart.VISUAL_ID:
			return getSelectDescription_5204Parser();
		case WhileDescription2EditPart.VISUAL_ID:
			return getWhileDescription_5205Parser();
		case CaseDescription3EditPart.VISUAL_ID:
			return getCaseDescription_5100Parser();
		case InsertDescription3EditPart.VISUAL_ID:
			return getInsertDescription_5101Parser();
		case UpdateDescription3EditPart.VISUAL_ID:
			return getUpdateDescription_5102Parser();
		case DeleteDescription3EditPart.VISUAL_ID:
			return getDeleteDescription_5103Parser();
		case SelectDescription3EditPart.VISUAL_ID:
			return getSelectDescription_5104Parser();
		case WhileDescription3EditPart.VISUAL_ID:
			return getWhileDescription_5112Parser();
		case ForDescription2EditPart.VISUAL_ID:
			return getForDescription_5105Parser();
		case CaseDescription4EditPart.VISUAL_ID:
			return getCaseDescription_5161Parser();
		case InsertDescription4EditPart.VISUAL_ID:
			return getInsertDescription_5162Parser();
		case UpdateDescription4EditPart.VISUAL_ID:
			return getUpdateDescription_5163Parser();
		case DeleteDescription4EditPart.VISUAL_ID:
			return getDeleteDescription_5164Parser();
		case SelectDescription4EditPart.VISUAL_ID:
			return getSelectDescription_5165Parser();
		case WhileDescription4EditPart.VISUAL_ID:
			return getWhileDescription_5186Parser();
		case LoopDescription2EditPart.VISUAL_ID:
			return getLoopDescription_5106Parser();
		case CaseDescription5EditPart.VISUAL_ID:
			return getCaseDescription_5166Parser();
		case InsertDescription5EditPart.VISUAL_ID:
			return getInsertDescription_5167Parser();
		case UpdateDescription5EditPart.VISUAL_ID:
			return getUpdateDescription_5168Parser();
		case DeleteDescription5EditPart.VISUAL_ID:
			return getDeleteDescription_5169Parser();
		case SelectDescription5EditPart.VISUAL_ID:
			return getSelectDescription_5170Parser();
		case WhileDescription5EditPart.VISUAL_ID:
			return getWhileDescription_5171Parser();
		case OpenDescription2EditPart.VISUAL_ID:
			return getOpenDescription_5107Parser();
		case FetchDescription2EditPart.VISUAL_ID:
			return getFetchDescription_5108Parser();
		case CloseDescription2EditPart.VISUAL_ID:
			return getCloseDescription_5109Parser();
		case CallProcedureDescription2EditPart.VISUAL_ID:
			return getCallProcedureDescription_5110Parser();
		case CallFunctionDescription2EditPart.VISUAL_ID:
			return getCallFunctionDescription_5111Parser();
		case ExpressionDescription2EditPart.VISUAL_ID:
			return getExpressionDescription_5220Parser();
		case ForDescription3EditPart.VISUAL_ID:
			return getForDescription_5185Parser();
		case ForDescription4EditPart.VISUAL_ID:
			return getForDescription_5184Parser();
		case LoopDescription3EditPart.VISUAL_ID:
			return getLoopDescription_5178Parser();
		case LoopDescription4EditPart.VISUAL_ID:
			return getLoopDescription_5177Parser();
		case OpenDescription3EditPart.VISUAL_ID:
			return getOpenDescription_5172Parser();
		case FetchDescription3EditPart.VISUAL_ID:
			return getFetchDescription_5173Parser();
		case CloseDescription3EditPart.VISUAL_ID:
			return getCloseDescription_5174Parser();
		case CallProcedureDescription3EditPart.VISUAL_ID:
			return getCallProcedureDescription_5175Parser();
		case CallFunctionDescription3EditPart.VISUAL_ID:
			return getCallFunctionDescription_5176Parser();
		case ExpressionDescription3EditPart.VISUAL_ID:
			return getExpressionDescription_5221Parser();
		case OpenDescription4EditPart.VISUAL_ID:
			return getOpenDescription_5179Parser();
		case FetchDescription4EditPart.VISUAL_ID:
			return getFetchDescription_5180Parser();
		case CloseDescription4EditPart.VISUAL_ID:
			return getCloseDescription_5181Parser();
		case CallProcedureDescription4EditPart.VISUAL_ID:
			return getCallProcedureDescription_5182Parser();
		case CallFunctionDescription4EditPart.VISUAL_ID:
			return getCallFunctionDescription_5183Parser();
		case ExpressionDescription4EditPart.VISUAL_ID:
			return getExpressionDescription_5222Parser();
		case ForDescription5EditPart.VISUAL_ID:
			return getForDescription_5206Parser();
		case LoopDescription5EditPart.VISUAL_ID:
			return getLoopDescription_5207Parser();
		case OpenDescription5EditPart.VISUAL_ID:
			return getOpenDescription_5208Parser();
		case FetchDescription5EditPart.VISUAL_ID:
			return getFetchDescription_5209Parser();
		case CloseDescription5EditPart.VISUAL_ID:
			return getCloseDescription_5210Parser();
		case CallProcedureDescription5EditPart.VISUAL_ID:
			return getCallProcedureDescription_5211Parser();
		case CallFunctionDescription5EditPart.VISUAL_ID:
			return getCallFunctionDescription_5212Parser();
		case ExpressionDescription5EditPart.VISUAL_ID:
			return getExpressionDescription_5223Parser();
		case CaseDescription6EditPart.VISUAL_ID:
			return getCaseDescription_5143Parser();
		case InsertDescription6EditPart.VISUAL_ID:
			return getInsertDescription_5144Parser();
		case UpdateDescription6EditPart.VISUAL_ID:
			return getUpdateDescription_5145Parser();
		case DeleteDescription6EditPart.VISUAL_ID:
			return getDeleteDescription_5146Parser();
		case SelectDescription6EditPart.VISUAL_ID:
			return getSelectDescription_5147Parser();
		case WhileDescription6EditPart.VISUAL_ID:
			return getWhileDescription_5148Parser();
		case ForDescription6EditPart.VISUAL_ID:
			return getForDescription_5149Parser();
		case LoopDescription6EditPart.VISUAL_ID:
			return getLoopDescription_5150Parser();
		case OpenDescription6EditPart.VISUAL_ID:
			return getOpenDescription_5151Parser();
		case FetchDescription6EditPart.VISUAL_ID:
			return getFetchDescription_5152Parser();
		case CloseDescription6EditPart.VISUAL_ID:
			return getCloseDescription_5153Parser();
		case CallProcedureDescription6EditPart.VISUAL_ID:
			return getCallProcedureDescription_5154Parser();
		case CallFunctionDescription6EditPart.VISUAL_ID:
			return getCallFunctionDescription_5155Parser();
		case ExpressionDescription6EditPart.VISUAL_ID:
			return getExpressionDescription_5224Parser();
		case CaseDescription7EditPart.VISUAL_ID:
			return getCaseDescription_5066Parser();
		case InsertDescription7EditPart.VISUAL_ID:
			return getInsertDescription_5067Parser();
		case UpdateDescription7EditPart.VISUAL_ID:
			return getUpdateDescription_5068Parser();
		case DeleteDescription7EditPart.VISUAL_ID:
			return getDeleteDescription_5069Parser();
		case SelectDescription7EditPart.VISUAL_ID:
			return getSelectDescription_5070Parser();
		case WhileDescription7EditPart.VISUAL_ID:
			return getWhileDescription_5071Parser();
		case ForDescription7EditPart.VISUAL_ID:
			return getForDescription_5072Parser();
		case LoopDescription7EditPart.VISUAL_ID:
			return getLoopDescription_5073Parser();
		case OpenDescription7EditPart.VISUAL_ID:
			return getOpenDescription_5074Parser();
		case FetchDescription7EditPart.VISUAL_ID:
			return getFetchDescription_5075Parser();
		case CloseDescription7EditPart.VISUAL_ID:
			return getCloseDescription_5076Parser();
		case CallProcedureDescription7EditPart.VISUAL_ID:
			return getCallProcedureDescription_5077Parser();
		case CallFunctionDescription7EditPart.VISUAL_ID:
			return getCallFunctionDescription_5078Parser();
		case ExpressionDescription7EditPart.VISUAL_ID:
			return getExpressionDescription_5225Parser();
		case DataTypeName3EditPart.VISUAL_ID:
			return getDataTypeName_5079Parser();
		case CollectionsName3EditPart.VISUAL_ID:
			return getCollectionsName_5080Parser();
		case RecordsName3EditPart.VISUAL_ID:
			return getRecordsName_5081Parser();
		case CursorName3EditPart.VISUAL_ID:
			return getCursorName_5082Parser();
		case DataTypeName4EditPart.VISUAL_ID:
			return getDataTypeName_5023Parser();
		case CollectionsName4EditPart.VISUAL_ID:
			return getCollectionsName_5024Parser();
		case RecordsName4EditPart.VISUAL_ID:
			return getRecordsName_5025Parser();
		case CursorName4EditPart.VISUAL_ID:
			return getCursorName_5026Parser();
		case DataTypeName5EditPart.VISUAL_ID:
			return getDataTypeName_5027Parser();
		case CollectionsName5EditPart.VISUAL_ID:
			return getCollectionsName_5028Parser();
		case RecordsName5EditPart.VISUAL_ID:
			return getRecordsName_5029Parser();
		case CursorName5EditPart.VISUAL_ID:
			return getCursorName_5030Parser();
		case ExceptionDescription8EditPart.VISUAL_ID:
			return getExceptionDescription_5083Parser();
		case IfDescription8EditPart.VISUAL_ID:
			return getIfDescription_5084Parser();
		case CaseDescription8EditPart.VISUAL_ID:
			return getCaseDescription_5085Parser();
		case InsertDescription8EditPart.VISUAL_ID:
			return getInsertDescription_5086Parser();
		case UpdateDescription8EditPart.VISUAL_ID:
			return getUpdateDescription_5087Parser();
		case DeleteDescription8EditPart.VISUAL_ID:
			return getDeleteDescription_5088Parser();
		case SelectDescription8EditPart.VISUAL_ID:
			return getSelectDescription_5089Parser();
		case WhileDescription8EditPart.VISUAL_ID:
			return getWhileDescription_5090Parser();
		case ForDescription8EditPart.VISUAL_ID:
			return getForDescription_5091Parser();
		case LoopDescription8EditPart.VISUAL_ID:
			return getLoopDescription_5092Parser();
		case OpenDescription8EditPart.VISUAL_ID:
			return getOpenDescription_5093Parser();
		case FetchDescription8EditPart.VISUAL_ID:
			return getFetchDescription_5094Parser();
		case CloseDescription8EditPart.VISUAL_ID:
			return getCloseDescription_5095Parser();
		case CallProcedureDescription8EditPart.VISUAL_ID:
			return getCallProcedureDescription_5096Parser();
		case CallFunctionDescription8EditPart.VISUAL_ID:
			return getCallFunctionDescription_5097Parser();
		case ExpressionDescription8EditPart.VISUAL_ID:
			return getExpressionDescription_5226Parser();
		case DataTypeName6EditPart.VISUAL_ID:
			return getDataTypeName_5037Parser();
		case CollectionsName6EditPart.VISUAL_ID:
			return getCollectionsName_5038Parser();
		case RecordsName6EditPart.VISUAL_ID:
			return getRecordsName_5039Parser();
		case CursorName6EditPart.VISUAL_ID:
			return getCursorName_5040Parser();
		case ExceptionDescription9EditPart.VISUAL_ID:
			return getExceptionDescription_5041Parser();
		case IfDescription9EditPart.VISUAL_ID:
			return getIfDescription_5042Parser();
		case CaseDescription9EditPart.VISUAL_ID:
			return getCaseDescription_5043Parser();
		case InsertDescription9EditPart.VISUAL_ID:
			return getInsertDescription_5044Parser();
		case UpdateDescription9EditPart.VISUAL_ID:
			return getUpdateDescription_5045Parser();
		case DeleteDescription9EditPart.VISUAL_ID:
			return getDeleteDescription_5046Parser();
		case SelectDescription9EditPart.VISUAL_ID:
			return getSelectDescription_5047Parser();
		case WhileDescription9EditPart.VISUAL_ID:
			return getWhileDescription_5048Parser();
		case ForDescription9EditPart.VISUAL_ID:
			return getForDescription_5049Parser();
		case LoopDescription9EditPart.VISUAL_ID:
			return getLoopDescription_5050Parser();
		case OpenDescription9EditPart.VISUAL_ID:
			return getOpenDescription_5051Parser();
		case FetchDescription9EditPart.VISUAL_ID:
			return getFetchDescription_5052Parser();
		case CloseDescription9EditPart.VISUAL_ID:
			return getCloseDescription_5053Parser();
		case CallProcedureDescription9EditPart.VISUAL_ID:
			return getCallProcedureDescription_5054Parser();
		case CallFunctionDescription9EditPart.VISUAL_ID:
			return getCallFunctionDescription_5055Parser();
		case ExpressionDescription9EditPart.VISUAL_ID:
			return getExpressionDescription_5227Parser();
		case TransitionNameEditPart.VISUAL_ID:
			return getTransitionName_6001Parser();
		case SelectorTransitionNameEditPart.VISUAL_ID:
			return getSelectorTransitionName_6002Parser();
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
