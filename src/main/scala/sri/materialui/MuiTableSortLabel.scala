package sri.materialui


import sri.core._
import sri.universal._

import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSName
import sri.web.vdom.DOMProps
import org.scalajs.dom
import scalajsplus.macros.{FunctionObjectMacro, exclude}
import scalajsplus.{OptDefault, OptionalParam, DangerousUnionToJSAnyImplicit}
import sri.web.vdom.ReactEventAliases._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|
     




 @js.native
 @JSImport("material-ui/Table","TableSortLabel")
object MuiTableSortLabelComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiTableSortLabel {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
active : OptionalParam[Boolean] = OptDefault,
className : OptionalParam[String] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
direction : OptionalParam[MuiTableSortLabelDirection] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiTableSortLabelComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiTableSortLabelComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiTableSortLabelComponent.type](
      MuiTableSortLabelComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiTableSortLabelC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiTableSortLabelComponent.type](
      MuiTableSortLabelComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         
 @js.native
 trait MuiTableSortLabelDirection extends js.Object
 
 object MuiTableSortLabelDirection {
   @inline def ASC = "asc".asInstanceOf[MuiTableSortLabelDirection] 
@inline def DESC = "desc".asInstanceOf[MuiTableSortLabelDirection] 
 } 
 
       


     

         
