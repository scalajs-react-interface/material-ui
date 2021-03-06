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
 @JSImport("material-ui/List","ListItem")
object MuiListItemComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiListItem {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
component : OptionalParam[String | js.Function] = OptDefault,
disabled : OptionalParam[Boolean] = OptDefault,
dense : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
divider : OptionalParam[Boolean] = OptDefault,
disableGutters : OptionalParam[Boolean] = OptDefault,
button : OptionalParam[Boolean] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiListItemComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiListItemComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiListItemComponent.type](
      MuiListItemComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiListItemC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiListItemComponent.type](
      MuiListItemComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         


     

         
